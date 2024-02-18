import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.IOException;

class B {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Student> students = (ArrayList<Student>)ois.readObject();

        for(Student st : students) {
            System.out.println(st.name);
            System.out.println(st.age);
            System.out.println(st.college);
            System.out.println("++++++++++++++");
        }       

        ois.close();
    }
}
