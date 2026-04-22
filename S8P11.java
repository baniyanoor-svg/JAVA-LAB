
class LifecycleDemo extends Thread {

    public void run() {
        try {
            System.out.println("Thread is in RUNNING state");

         
            Thread.sleep(2000);
            System.out.println("Thread is in TIMED WAITING (sleep)");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread work finished");
    }
}

public class S8P11 {
    public static void main(String[] args) throws InterruptedException {

        LifecycleDemo t1 = new LifecycleDemo();

     
        System.out.println("State after creation: " + t1.getState());

    
        t1.start();
        System.out.println("State after start(): " + t1.getState());

      
        Thread.sleep(500);
        System.out.println("State during execution: " + t1.getState());

      
        t1.join();


        System.out.println("State after completion: " + t1.getState());
    }
}
