package _1_xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import java.io.File;

public class XmlCreate {
    public static void main(String[] args) {

        XmlResult xmlResult = new XmlResult();
        Products products = new Products();
        products.setProducts(xmlResult.result());

        // xml create
        try {
            File file = new File("sample.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(products, file);
        }catch (Exception e) {
            System.err.println("Xml Create Exception" + e.getMessage());
        }

    }
}
