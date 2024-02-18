import java.io.FileReader;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("golu.txt");

        char[] arr = new char[20];
        int  n = 0;

        while((n=fr.read(arr)) != -1) {
            for(char ch : arr) {
                System.out.print(ch);
            }
        }

        fr.close();
    }
}