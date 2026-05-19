// Program to demonstrate thread

class MyThread extends Thread {

    public void run() {

        // thread task
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running : " + i);
        }
    }
}

class ThreadDemo {
    public static void main(String args[]) {

        MyThread t1 = new MyThread();

        // starting thread
        t1.start();
    }
}