package threads;

public class JoinExample {
    public static void main(String[] args) {
        Thread threadOne = new Thread(() -> {
            for (int i = 1; i < 6; i++) {
                System.out.println("Thread one: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Thread one interrupted.");
                }
            }
            System.out.println("Thread one finished.");
        });


        Thread threadTwo = new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                System.out.println("Thread two: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Thread two interrupted.");
                }
            }
            System.out.println("Thread two finished.");
        });

        try {
            threadOne.start();
            threadOne.join();
            threadTwo.start();
        } catch (InterruptedException e) {
            System.out.println("Threads interrupted!");
        }
    }
}