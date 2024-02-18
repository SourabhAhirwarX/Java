import java.io.FileWriter;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        // FileWriter fw = new FileWriter("ganesh.txt");
        FileWriter fw = new FileWriter("mohan.txt");

        fw.write('A');
        fw.write('t');
        fw.write('9');
        fw.write('\t');
        fw.write('%');
        fw.write('\n');
        fw.write('R');

        fw.flush();
        fw.close();
    }
}