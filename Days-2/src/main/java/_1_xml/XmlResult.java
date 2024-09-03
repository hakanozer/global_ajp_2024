package _1_xml;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XmlResult {

    public List<Product> result() {
        List<Product> ls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product p = new Product();
            p.setPid(i);
            p.setTitle("Product " + i);
            int price = (int) ((Math.random() * 100 ) + i);
            p.setPrice(price);

            Category c = new Category();
            c.setCid(i*2);
            c.setName("Category " + i);
            p.setCategory(c);

            ls.add(p);
        }
        return ls;
    }

}
