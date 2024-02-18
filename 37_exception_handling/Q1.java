import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        File file = new File("a.txt");

        try {
            file.createNewFile();
        } catch(IOException e) {
            System.out.println("IOE");
        }
    }
}