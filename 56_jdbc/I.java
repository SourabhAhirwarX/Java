import java.sql.*;

class A {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?user=root&password=1523");

            String query = "insert into employees (name, contact, email, password, dob) value ('varsha', 1453747, 'varsha@gmail.com', 1236, '2002-02-25')";

            PreparedStatement ps = con.prepareStatement(query);

            ps.executeUpdate();
            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}