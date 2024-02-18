import java.io.*;

class B {
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        FileInputStream fis = new FileInputStream("abc.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee emp = (Employee)ois.readObject();

        System.out.println(emp.name);
        System.out.println(emp.age);
        System.out.println(emp.address);
        System.out.println(emp.address.city);
        System.out.println(emp.address.state);
    }    
}
