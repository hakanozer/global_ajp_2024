package _3_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UseExecutorService {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            try {
                ExecutorService executorService = Executors.newCachedThreadPool();
                Future<Integer> future1 = executorService.submit(new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        System.out.println("future1 Call");
                        Thread.sleep(20000);
                        return 30;
                    }
                });

                Future<Integer> future2 = executorService.submit(new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        System.out.println("future2 Call");
                        Thread.sleep(15000);
                        return 40;
                    }
                });
                System.out.println("Threads Start");
                executorService.shutdown();
                System.out.println("future1 :" + future1.get());
                System.out.println("future2 :" + future2.get());
                System.out.println("Threads Stop");

            }catch (Exception ex) {
                ex.printStackTrace();
            }
        };
        new Thread(runnable).start();

        System.out.println("this line call");
    }
}
