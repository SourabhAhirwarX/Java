import java.io.FileWriter;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("golu.txt");

        char[] arr = {'a', 'j', 'i', 't'};

        fw.write(arr);

        fw.flush();
        fw.close();
    }
}