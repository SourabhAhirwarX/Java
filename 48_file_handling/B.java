import java.io.File;

class A {
    public static void main(String[] args) {
        // folder absolute path
        File file1 = new File("C:\\Users\\soura\\Desktop\\JAVA\\Programs\\48_file_handling\\AAA");
        // folder relative path
        File file2 = new File("JAVA\\Programs\\48_file_handling\\AAA");

        // file absolute path
        File file3 = new File("C:\\Users\\soura\\Desktop\\JAVA\\Programs\\48_file_handling\\golu.txt");
        // file relative path
        File file4 = new File("48_file_handling\\golu.txt");

        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file3);
        System.out.println(file4);
    }
}