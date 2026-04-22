
    
 public class S8P10 {

    public static void main(String[] args) {

        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running...");
                try { Thread.sleep(1000); } catch (Exception e) {}
            }
        });

        daemonThread.setDaemon(true); 
        daemonThread.start();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {}

        System.out.println("Main thread finished");
    }
}
