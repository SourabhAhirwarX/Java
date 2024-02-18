import java.io.File;

class A {
    public static void main(String[] args) {
        // first
        // run without creating the folder path: abc/mno/pqr
        // then
        // after creating the folder path: abc/mno/ and then try to run it.

        File file = new File("abc/mno/pqr");
        
        System.out.println(file.mkdir());
    }
}

// case 1:
// false: because we don't have abc folder.
// case 2:
// true: when we create abc folder and inside abc folder we created mno folder, so than now we can create the folder.