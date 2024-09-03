package _4_jdbc;

public class MainJDBC {
    public static void main(String[] args) {

        CustomerService service = new CustomerService();
        int insertStatus = service.save("Asya", "Bilir", "asya@mail.com", "12345");
        System.out.println(insertStatus);
    }
}
