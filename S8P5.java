
class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "Priority:" + Thread.currentThread().getPriority());
    }

}

public class S8P5 {
    public static void main(String[] args) {

        PriorityThread p1 = new PriorityThread("Low Priority Thread");

        PriorityThread p2 = new PriorityThread("Normal Priority Thread");

        PriorityThread p3 = new PriorityThread("High Priority Thread");

        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.NORM_PRIORITY);
        p3.setPriority(Thread.MAX_PRIORITY);
        p1.start();
        p2.start();
        p3.start();
    }

}
