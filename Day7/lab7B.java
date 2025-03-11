public class lab7B {
    static String messages[] = {"I","Lob", "Java", "Programming", "Language", "Very", "Much"};
    static class SyncThread extends Thread{
        SyncThread(String name){
            super(name);
        }
        public void run(){
            for (int i = 0; i < messages.length; i++) {
                System.out.println(getName()+" : "+messages[i]);
            }
        }
    }
    public static void main(String[] args) {
       SyncThread bhole = new SyncThread("bhole");
       SyncThread Chature = new SyncThread("chature");
       bhole.run();
       Chature.run();
    }
}
