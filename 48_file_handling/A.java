// if we don't provide the absolute path then it will search for the file/folder name in the current context, where the .class file stored

import java.io.File;

class A {
    public static void main(String[] args) {
        // existing folder path in the current context
        File file1 = new File("AAA");

        // existing file path in the current context
        File file2 = new File("golu.txt");

        System.out.println(file1);
        System.out.println(file2);
    }
}

// we can pass folder name, file name in the file object...