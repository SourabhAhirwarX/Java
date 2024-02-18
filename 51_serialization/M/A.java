import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<Student>();
        
        Student s1 = new Student();
        s1.name = "om";
        s1.age = 21;
        s1.college = "JEc";

        students.add(s1);
        
        Student s2 = new Student();
        s2.name = "ram";
        s2.age = 22;
        s2.college = "Global";

        students.add(s2);

        Student s3 = new Student();
        s3.name = "yam";
        s3.age = 100;
        s3.college = "SRIT";
        
        students.add(s3);

        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);

        oos.close();
    }
}