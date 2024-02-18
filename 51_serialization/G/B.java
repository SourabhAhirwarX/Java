import java.io.*;

class B {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Employee employee = (Employee)(new ObjectInputStream(new FileInputStream("vyankatesh.txt")).readObject());
        
        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.designation);
        System.out.println(employee.salary);
    }
}
