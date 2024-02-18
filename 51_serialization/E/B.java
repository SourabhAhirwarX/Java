import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class B {
    public static void main(String[] args) {
        File file = new File("bunty.txt");

        try {
            FileInputStream fis = new FileInputStream(file);

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student student = (Student)ois.readObject();

            System.out.println(student.name);
            System.out.println(student.age);
            System.out.println(student.degree);
            System.out.println(student.semester);

            ois.close();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
