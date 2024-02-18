import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        file.createNewFile();
    }
}