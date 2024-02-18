import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        File file = new File("motupatlu.txt");

        try {
            file.createNewFile();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}