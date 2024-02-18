import java.io.*;

class A {
    public static void main(String[] args) throws IOException {
        Employee emp = new Employee();

        emp.name = "Ratnesh";
        emp.age = 28;
        emp.address = new Address("Jaypur", "Rajasthan");
        
        FileOutputStream fos = new FileOutputStream("abc.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(emp);

        oos.close();
    }
}