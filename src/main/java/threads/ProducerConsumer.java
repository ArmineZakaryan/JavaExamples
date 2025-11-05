package threads;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
    public static void main(String[] args) {

        List<String> buffer = new ArrayList<>();

        Thread producer = new Thread(() -> {
            synchronized (buffer) {
                try {
                    if (buffer.isEmpty()) {
                        System.out.println("Producer: adding apple");
                        buffer.add("apple");
                        buffer.notify();
                    } else {

                        buffer.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                if (buffer.isEmpty()) {
                    buffer.wait();
                }
                System.out.println("Consumer: took " + buffer.remove(0));
                buffer.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}