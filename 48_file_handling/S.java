import java.io.File;

class A {
    public static void main(String[] args) {
        // File parent = new File("C:\\Users\\soura\\Desktop\\JAVA\\Programs\\48_file_handling");
        // File file = new File(parent, "aaa");

        File parent = new File("C:\\Users\\soura\\Desktop\\JAVA");
        File file = new File(parent, "Programs\\48_file_handling\\aaa");
        
        System.out.println(file.exists());
    }
}