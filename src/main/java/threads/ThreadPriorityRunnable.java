package threads;

public class ThreadPriorityRunnable implements Runnable {
    private String name;

    public ThreadPriorityRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " priority:(" + current.getPriority() + ") - " + i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadPriorityRunnable("Low priority thread"));
        Thread t2 = new Thread(new ThreadPriorityRunnable("Normal priority thread"));
        Thread t3 = new Thread(new ThreadPriorityRunnable("High priority thread"));

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}