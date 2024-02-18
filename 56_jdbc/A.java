import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

class A {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?user=root&password=1523");

            String query = "select * from employees";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                System.out.println("Emp_id: " + rs.getInt(1));
                System.out.println("Emp Name: " + rs.getString(2));
                System.out.println("Emp Contact: " + rs.getString(3));
                System.out.println("Emp Email: " + rs.getString(4));
                System.out.println("Emp Password: " + rs.getString(5));
                System.out.println("Emp Dob: " + rs.getDate(6));

                System.out.println("\n");
            }
            
            con.close();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}