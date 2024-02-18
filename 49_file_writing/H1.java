import java.io.PrintWriter;
import java.io.FileNotFoundException; 

class A {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("extra.txt");

        pw.println(true);
        pw.println(23L);
        pw.println(2.4);

        pw.close();
    }
}