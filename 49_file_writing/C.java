import java.io.FileWriter;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("mohan.txt", true);

        fw.append('S');
        fw.append('K');
        fw.append('A');

        fw.flush();
        fw.close();
    }
}