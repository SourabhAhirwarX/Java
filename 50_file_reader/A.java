import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        // file not exist...
        File file = new File("golu.txt");
        FileReader fr = new FileReader(file);

        System.out.println(fr.read());
        System.out.println(fr.read());
        System.out.println(fr.read());

        fr.close();
    }
}

// Exception in thread "main" java.io.FileNotFoundException: golu.txt (The System cannot find the file specified)