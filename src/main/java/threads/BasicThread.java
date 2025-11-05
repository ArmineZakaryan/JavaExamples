package threads;

public class BasicThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(getName() + " -> " + i);
        }
    }

    public static void main(String[] args) {
        BasicThread thread1 = new BasicThread();
        BasicThread thread2 = new BasicThread();

        thread1.start();
        thread2.start();
    }
}