import java.io.FileReader;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        // file already exist...
        FileReader fr = new FileReader("golu.txt");

        int n = 0;

        while((n=fr.read()) != -1 ) {
            System.out.print((char)n);
        }

        fr.close();
    }
}