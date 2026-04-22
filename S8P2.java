class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i < 6; i++) {

            System.out.println(i + "-" + Thread.currentThread().getName());

        }
    }
}

public class S8P2 {
    public static void main (String[]args){

Thread t1 = new Thread(new MyRunnable());

t1.start();
for (int i = 1; i < 6; i++) {
            System.out.println("Main Thread running");
        }
    }

}
