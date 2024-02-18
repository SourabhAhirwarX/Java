import java.io.IOException;
import java.io.FileNotFoundException;

class A {
    public static void main(String[] args) {
        try {
            if(12>15) {
                throw new FileNotFoundException();
            } else {
                throw new IOException();
            }
        } catch(FileNotFoundException e) {
            System.out.println("FNFE");
        } catch(IOException e) {
            System.out.println("IOE");
        }
    }
}