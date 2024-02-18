import java.io.File;

class A {
    public static void main(String[] args) {
        // File file = new File("dholubholu.txt");
        File file = new File("C:\\Users\\soura\\Desktop\\JAVA\\Programs\\48_file_handling\\dholubholu.txt");

        String parPath = file.getParent();

        System.out.println(" ### " +  parPath + " ### ");
    }
}