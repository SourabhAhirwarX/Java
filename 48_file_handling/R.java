import java.io.File;

class A {
    public static void main(String[] args) {
        // File file = new File("C:\\Users\\soura\\Desktop\\JAVA\\Programs\\48_file_handling", "aaa");
        // File file = new File("C:\\Users\\soura\\Desktop\\JAVA", "Programs\\48_file_handling\\aaa");
        File file = new File("C:\\Users\\soura\\Desktop", "JAVA\\Programs\\48_file_handling\\aaa");

        System.out.println(file.exists());
    }
}