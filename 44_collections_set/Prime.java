import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prime {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(n + " is prime: " + primeChecker(n));
    }

    public static boolean primeChecker(int n) {
        if(n < 2) {
            return false;
        }

        /* basic approach
        for(int i=2; i<n; i++) {
            if(n%2 == 0) {
                return false;
            }
        }
        */

        // optimized approach
        for(int i=2; i<=n/2; i++) {
            if(n%i == 0) {
                return false;
            }
        }

        // square root approach(most optimized one)

        return true;
    }
}

class JDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_db?user=root&password=1523");

            //////////////////    Select   /////////////////////////////
            String query = " select * from products where quantity>? order by price asc";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 2);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                System.out.println(rs.getInt(1) + " - " + rs.getString("name") + " - " + rs.getInt(3) + " - " + rs.getInt("price"));
            }

            //////////////////   Insert   ///////////////////////////
            String query2 = "insert into products (name, quantity, price) value (?, ?, ?)";
            
            PreparedStatement ps2 = con.prepareStatement(query2);
            ps2.setString(1, "buds");
            ps2.setInt(2, 3);
            ps2.setInt(3, 3600);

            ps2.executeUpdate();

            ///////////////////    Update    //////////////////////////
            String query3 = "update products set name=? where product_id>? and product_id<?";
            
            PreparedStatement ps3 = con.prepareStatement(query3);
            ps3.setString(1, "oppo encho");
            ps3.setInt(2, 10);
            ps3.setInt(3, 12);

            ps3.executeUpdate();

            con.close();
        } catch(ClassNotFoundException|SQLException e) {
            e.printStackTrace();
        }
    }
}