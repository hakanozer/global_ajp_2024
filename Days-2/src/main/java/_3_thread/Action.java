package _3_thread;

public class Action extends Thread{

    private String imagePath = "";
    public Action(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println( imagePath + " Upload...");
            }
        }catch (Exception ex) {}
        System.out.println(imagePath +" Upload complete...");
    }

}
