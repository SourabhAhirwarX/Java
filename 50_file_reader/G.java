import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader("golu.txt"));

        String str = null;

        while ((str=fr.readLine() ) != null) {
            System.out.println(str);
        }

        fr.close();
    }
}