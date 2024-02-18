import java.io.IOException;
import java.io.FileNotFoundException;

class A {
    public static void main(String[] args) {
        try {
            throw new FileNotFoundException();
        } catch(IOException e) {

        } catch(FileNotFoundException e) {      // error: reached end of file while parsing

        }
}