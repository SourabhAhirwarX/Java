import java.io.PrintWriter;
import java.io.FileNotFoundException; 

class A {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("Tikku.txt");

        String name = "Golu prasad";
        int age = 23;
        float marks = 89.34f;

        // pw.printf("My name is %s and age is %d my marks: %.3f", name, age, marks);
        pw.format("My name is "+name+" and age is "+age+ " my marks: "+marks);

        pw.close();
    }
}