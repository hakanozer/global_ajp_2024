package _3_thread;

public class Action extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        }catch (Exception ex) {}
        System.out.println("Thread is running...");
    }

}
