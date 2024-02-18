import java.sql.*;
import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your contact: ");
        String contact = sc.next();
        System.out.print("Enter your email: ");
        String email = sc.next();
        System.out.print("Enter your password: ");
        String password = sc.next();
        System.out.print("Enter your dob(yyyy-mm-dd): ");
        String dob = sc.next();
        Date date = Date.valueOf(dob);

        sc.close();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?user=root&password=1523");

            String query = "insert into employees (name, contact, email, password, dob) value (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, contact);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setDate(5, date);

            ps.executeUpdate();

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}