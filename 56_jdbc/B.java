import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

class A {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?user=root&password=1523");

            // String query = "insert into cities (city_name) value ('Bhopal')";
            String query = "insert into cities (city_name) values ('Katni'), ('Itarsi')";

            PreparedStatement ps = con.prepareStatement(query);

            int count = ps.executeUpdate();
            System.out.println(count);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}