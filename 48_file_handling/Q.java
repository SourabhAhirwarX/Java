import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("aaa");

        String[] arr = file.list();

        for(String tmp : arr) {
            System.out.println(tmp);
        }
    }
}