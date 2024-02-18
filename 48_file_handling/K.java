import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        File file = new File("KALIYA");

        System.out.println(file.exists());

        if(!file.exists()) {
            System.out.println(file.mkdir());
        }

        System.out.println(file.exists());
    }
}