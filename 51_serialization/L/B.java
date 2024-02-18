import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class B {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student x1 = (Student)ois.readObject();
        Student x2 = (Student)ois.readObject();
        Employee e = (Employee)ois.readObject();

        System.out.println(x1.name);
        System.out.println(x1.age);
        System.out.println(x1.college);
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(x2.name);
        System.out.println(x2.age);
        System.out.println(x2.college);
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(e.name);
        System.out.println(e.company);
        System.out.println(e.salary);

        ois.close();
    }
}