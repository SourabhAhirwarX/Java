import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;

class A {
    public static void main(String[] args) throws IOException {
        // File file = new File("rahul.txt");
        // FileWriter fw = new FileWriter(file);
        // BufferedWriter bf = new BufferedWriter(fw);

        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("rahul.txt")));

        bw.write("mohan a great singer");
        bw.newLine();
        bw.write(new char[]{'v', 'i', 'r', 'a', 't'});

        bw.flush();
        bw.close();
    }   
}