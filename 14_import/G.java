import java.util.Date;
import java.io.File;

class A {
    public static void main(String[] args) {
        Date date = new Date();

        File file = new File("abc.txt");

        System.out.println(date);
        System.out.println(file);
    }
}