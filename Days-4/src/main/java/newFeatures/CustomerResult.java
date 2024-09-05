package newFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomerResult {

    public List<Customer> result(int count) {
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Customer customer = new Customer();
            customer.setId(i);
            customer.setAge(new Random().nextInt(100));
            customer.setName("Name " + i);
            customers.add(customer);
        }
        return customers;
    }
}
