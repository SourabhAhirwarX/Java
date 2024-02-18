import java.io.*;

class A {
    public static void main(String[] args) throws IOException {
        Employee emp = new Employee();

        emp.name = "yamraj";
        emp.age = 100;
        emp.designation = "Manager";
        emp.salary = 32000.34f;

        new ObjectOutputStream(new FileOutputStream("vyankatesh.txt")).writeObject(emp);
    }
}
