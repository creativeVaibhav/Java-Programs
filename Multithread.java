public class Multithread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new Multithread().start();
        /*
         Multithread m2 = new Multithread();
         Multithread m3 = new Multithread();
         Multithread m4 = new Multithread();
         */
        // m1.start();
        // m1.start();
    }
}