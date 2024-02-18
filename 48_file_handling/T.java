import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("yamraj"); 
        // File file = new File("aaa");     // this doesn't work because this folder contains elements i.e it is not empty...

        file.delete();
    }
}