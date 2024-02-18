import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        // File file = new File("Tikku");
        File file = new File("dholubholu.txt");
        
        // file.createNewFile();

        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
    }
}