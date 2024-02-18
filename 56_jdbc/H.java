import java.sql.*;

class A {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?user=root&password=1523");

            String query="update employees set name='soumya', email='soumya@gmail.com', dob='2001-04-16' where employee_id=6";

            PreparedStatement ps = con.prepareStatement(query);

            ps.executeUpdate();
            con.close();
        }
        catch(SQLException|ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}