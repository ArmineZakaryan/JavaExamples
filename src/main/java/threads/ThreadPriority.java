package threads;

public class ThreadPriority extends Thread {

    public ThreadPriority(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(getName() + " priority:(" + getPriority() + ") - " + i);
        }
    }


    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority("Low priority thread");
        ThreadPriority t2 = new ThreadPriority("Normal priority thread");
        ThreadPriority t3 = new ThreadPriority("High priority thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}