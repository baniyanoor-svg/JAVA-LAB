
    
 public class S8P9 {

    public static void main(String[] args) {

        final Object resource1 = "Resource1";
        final Object resource2 = "Resource2";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 locked Resource 1");

                try { Thread.sleep(100); } catch (Exception e) {}

                System.out.println("Thread 1 waiting for Resource 2");
                synchronized (resource2) {
                    System.out.println("Thread 1 locked Resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 locked Resource 2");

                try { Thread.sleep(100); } catch (Exception e) {}

                System.out.println("Thread 2 waiting for Resource 1");
                synchronized (resource1) {
                    System.out.println("Thread 2 locked Resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
