import java.io.PrintWriter;
import java.io.FileNotFoundException; 

class A {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("extra.txt");

        pw.print(true);
        pw.print(23L);
        pw.print(2.4);

        pw.close();
    }
}