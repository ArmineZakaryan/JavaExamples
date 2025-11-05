package threads;

public class PrintNumbers extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0 && currentThread().getName().equals("Even thread")) {
                System.out.println(currentThread().getName() + " " + i);
            } else if (i % 2 != 0 && currentThread().getName().equals("Odd thread")) {
                System.out.println(currentThread().getName() + " " + i);
            }
        }
    }

    public static void main(String[] args) {
        PrintNumbers evenThread = new PrintNumbers();
        PrintNumbers oddThread = new PrintNumbers();

        evenThread.setName("Even thread");
        oddThread.setName("Odd thread");
        evenThread.start();
        oddThread.start();
    }
}