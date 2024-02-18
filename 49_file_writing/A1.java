import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        // File file = new File("mohan.txt");
        File file = new File("ganesh.txt");

        try {
            file.createNewFile();

            FileWriter fw = new FileWriter(file);

            fw.write('a');
            fw.write('b');
            fw.write('c');
            fw.write(100);

            fw.flush();
            fw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}