
//producer-consumer problem using wait() and notify()
class Buffer {
    private int data;
    private boolean available = false;

    synchronized void produce(int value) {
        try {
            while (available) {
                wait();
            }
            data = value;
            System.out.println("Produced: " + data);
            available = true;
            notify();
        } catch (InterruptedException e) {
        }
    }

    synchronized void consume() {
        try {
            while (!available) {
                wait();
            }
            System.out.println("Consumed: " + data);
            available = false;
            notify();
        } catch (InterruptedException e) {
        }
    }
}

public class S8P8 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}
