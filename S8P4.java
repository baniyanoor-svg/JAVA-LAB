
class ChildThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class S8P4{
    public static void main(String[] args) {
        ChildThread t = new ChildThread();
        t.start();

        try {
            t.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread resumes execution.");
    }
}












    

