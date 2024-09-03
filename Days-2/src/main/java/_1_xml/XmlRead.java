package _1_xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class XmlRead {
    public static void main(String[] args) {

        // xml read
        try {
            File file = new File("sample.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Products products = (Products) unmarshaller.unmarshal(file);
            for (Product product : products.getProducts()) {
                System.out.println(product);
            }
        }catch (Exception ex) {
            System.err.println("Xml Read Error: " + ex);
        }


    }
}
