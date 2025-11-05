package threads;

public class DaemonExample {
    public static void main(String[] args) {

        Thread backgroundThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is working...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }

            }
        });

        backgroundThread.setDaemon(true);
        backgroundThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread running " + i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main thread finished!");
    }
}