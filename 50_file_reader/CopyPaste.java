import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedReader;

class A {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("mohan.txt"));
        
        File file = new File("golu.txt");
        PrintWriter pr = new PrintWriter(file);

        int n = 0;
        while((n=br.read()) != -1) {
            System.out.print((char)n);
            pr.print((char)n);
        }

        br.close();
        pr.close();
    }
}