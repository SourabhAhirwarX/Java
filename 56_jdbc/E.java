import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = sc.next();
        
        System.out.println("Enter your Contact: ");
        String contact = sc.next();
        
        System.out.println("Enter your Email: ");
        String email = sc.next();
       
        System.out.println("Enter your Password: ");
        String passw = sc.next();
       
        System.out.println("Enter your DOB(yyyy-mm-dd): ");
        String date = sc.next();
        Date dob = Date.valueOf(date);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?user=root&password=1523");

            String query = "insert into employees (name, contact, email, password, dob) value (?, ?, ?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(query);

            System.out.println(pst);

            pst.setString(1, name);
            pst.setString(2, contact);
            pst.setString(3, email);
            pst.setString(4, passw);
            pst.setDate(5, dob);

            System.out.println(pst);

            int count = pst.executeUpdate();
            System.out.println(count);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}