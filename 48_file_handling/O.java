import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException{
        File file = new File("dholubholu.txt");

        if(!file.exists()) {
            file.createNewFile();
        }

        File dest = new File("DholuBholuCompany");

        System.out.println(file.renameTo(dest));
        System.out.println(dest.isHidden());
    }
}