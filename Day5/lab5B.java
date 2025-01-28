import java.util.*;

interface Motor {
    int capacity = 100; // data member

    void run(); // method declaration

    void consume(); // method declaration
}

class WashingMachine implements Motor {

    @Override
    public void run() {
        System.out.println("Washing machine is running.");
    }

    @Override
    public void consume() {
        System.out.println("Washing machine is consuming power.");
    }

    public void checkCapacity() {
        System.out.println("The capacity of the motor is: " + Motor.capacity);
    }

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        wm.checkCapacity();
    }
}