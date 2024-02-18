import java.io.File;
import java.io.FileReader;
// import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        // file already exist...
        File file = new File("golu.txt");
        FileReader fr = new FileReader(file);

        System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        System.out.println(fr.read());

        fr.close();
    }
}