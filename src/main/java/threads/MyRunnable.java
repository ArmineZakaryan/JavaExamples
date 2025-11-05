package threads;


public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }

    public static void main(String[] args) {


        Thread myRunnable1 = new Thread(new MyRunnable());
        Thread myRunnable2 = new Thread(new MyRunnable());

        myRunnable1.start();
        myRunnable2.start();
    }
}