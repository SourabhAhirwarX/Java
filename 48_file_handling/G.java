import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("abc/mno/pqr/ifg");

        System.out.println(file.mkdirs());
    }
}