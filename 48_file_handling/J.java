import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        File file = new File("chutki.txt");

        System.out.println(file.exists());

        if(!file.exists()) {
            file.createNewFile();
        }

        System.out.println(file.exists());
    }
}