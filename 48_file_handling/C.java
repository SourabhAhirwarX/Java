import java.io.File;

class A {
    public static void main(String[] args) {
        // folder non existing
        File file1 = new File("RRR");

        // file non existing
        File file2 = new File("sss.txt");

        System.out.println(file1);
        System.out.println(file2);
    }
}