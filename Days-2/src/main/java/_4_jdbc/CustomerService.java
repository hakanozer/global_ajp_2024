package _4_jdbc;

import java.sql.PreparedStatement;

public class CustomerService {

    public int save( String name, String surname, String email, String password ) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "insert into CUSTOMER values(default,?,?,?,?)";
            PreparedStatement pre = db.getConnection().prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, surname);
            pre.setString(3, email);
            pre.setString(4, password);
            status = pre.executeUpdate();
        }catch (Exception e) {
            System.err.println("Save Error:" + e.getMessage());
        }finally {
            db.close();
        }
        return status;
    }

}
