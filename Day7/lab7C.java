import java.util.LinkedList;
import java.util.Queue;

public class lab7C {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);
        
        Thread producer = new Thread(new Producer(buffer, new int[]{1, 2, 3, 4, 5, 6}));
        Thread consumer = new Thread(new Consumer(buffer, 3));
        
        producer.start();
        consumer.start();
    }
}

class Buffer {
    Queue<Integer> queue;
    int size;
    
    public Buffer(int size) {
        this.queue = new LinkedList<>();
        this.size = size;
    }
    
    public synchronized void produce(int item) throws InterruptedException {
        while (queue.size() == size) {
            System.out.println("Buffer is full. Producer waiting...");
            wait();
        }
        
        queue.add(item);
        System.out.println("Producer produced: " + item);
        notifyAll();
    }
    
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Buffer is empty. Consumer waiting...");
            wait();
        }
        
        int item = queue.poll();
        System.out.println("Consumer consumed: " + item);
        notifyAll();
        return item;
    }
}

class Producer implements Runnable {
    Buffer buffer;
    int[] items;
    
    public Producer(Buffer buffer, int[] items) {
        this.buffer = buffer;
        this.items = items;
    }
    
    @Override
    public void run() {
        try {
            for (int item : items) {
                buffer.produce(item);
                Thread.sleep(100); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    Buffer buffer;
    int count;
    
    public Consumer(Buffer buffer, int count) {
        this.buffer = buffer;
        this.count = count;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(500); 
            
            for (int i = 0; i < count; i++) {
                buffer.consume();
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
