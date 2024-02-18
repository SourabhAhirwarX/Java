import java.io.FileWriter;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sun.txt");

        String str1 = "Java is my cup of tea";
        String str2 = "C/C++ is my cup of tea";

        fw.write(str1);
        fw.write('\n');
        fw.write(str2);

        fw.flush();
        fw.close();
    }
}