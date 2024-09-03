package _3_thread;

public class UseMainThread {
    public static void main(String[] args) {

        Action ac1 = new Action();
        ac1.start();

        System.out.println("this line call");

    }
}
