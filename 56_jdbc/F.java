import java.sql.*;

class A {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?user=root&password=1523");

        String query = "update employees set name='Aman Agrawal', contact='6778786767', email='amana@gmail.com' where employee_id=4";

        PreparedStatement pst = con.prepareStatement(query);

        pst.executeUpdate();

        con.close();
    }
}