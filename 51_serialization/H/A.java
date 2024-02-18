import java.io.*;

class A {
    public static void main(String[] args) throws IOException {
        Student s = new Student();
        s.name = "rohan";
        s.age = 23;

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("golu.txt")));
        oos.writeObject(s);

        oos.close();
    }
}