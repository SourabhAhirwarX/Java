import java.io.*;

class A {
    public static void main(String[] args) throws IOException {
        Employee e = new Employee("golu", 12, new Address(new City("JBp"), new State("MP")));

        new ObjectOutputStream(new FileOutputStream("vikram.txt")).writeObject(e);
    }
}