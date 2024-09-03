package _1_xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Product {

    private int pid;
    private String title;
    private int price;
    private Category category;

}
