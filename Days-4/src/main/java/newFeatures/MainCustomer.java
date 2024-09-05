package newFeatures;

import java.util.ArrayList;
import java.util.List;

public class MainCustomer {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        CustomerResult customerResult = new CustomerResult();
        List<Customer> customers = customerResult.result(1000000);

        // Stream Api
        customers.parallelStream()
                .filter( item -> item.getId() > 500000 )
                .filter( item -> item.getName().contains("00") )
                .forEach(item -> {
                    try {
                        Thread.sleep(10);
                    }catch (Exception ex) {}
                    System.out.println(item);
                });


        long endTime = System.currentTimeMillis();
        long betweenTime = endTime - startTime;
        System.out.println(betweenTime);

    }
}

// stream api -> 210445
// paralel stream api -> 30815