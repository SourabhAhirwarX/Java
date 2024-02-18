import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("jaadu.txt");

        File dest = new File("DholuBholuCompany/sanatan");

        file.renameTo(dest);
    }
}