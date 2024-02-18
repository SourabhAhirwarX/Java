import java.io.FileReader;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("golu.txt");

        char[] arr = new char[20];

        System.out.println(fr.read(arr));
        for(char ch : arr) {
            System.out.print(ch);
        }

        System.out.println(fr.read(arr));
        for(char ch : arr) {
            System.out.print(ch);
        }

        fr.close();
    }
}