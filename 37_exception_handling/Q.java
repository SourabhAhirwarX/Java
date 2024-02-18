import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("a.txt");
        file.createNewFile();       // error: unreported exception IOException; must be caught or declared to be thrown
    }
}