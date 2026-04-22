

        class SleepThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Before sleep: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("After sleep: " + i);
        }
    }
}

public class S8P3 {
    public static void main(String[] args) {
        SleepThread t = new SleepThread();
        t.start();
    }
}