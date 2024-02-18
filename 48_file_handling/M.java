import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("dholubholu.txt");

        String absoPath = file.getAbsolutePath();

        System.out.println(" ~~~~~  " + absoPath + "  ~~~~~");
    }
}