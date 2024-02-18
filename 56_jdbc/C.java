import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import java.io.Console;

class A {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter City Name: ");

        String cityName = c.readLine();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?user=root&password=1523");

            String query = "insert into cities (city_name) value (?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cityName);

            int count = ps.executeUpdate();
            System.out.println(count);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}