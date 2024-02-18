import java.io.PrintWriter;
import java.io.FileNotFoundException; 

class A {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("simba.txt");

        String name = "Golu prasad";
        int age = 23;
        float marks = 89.34f;

        pw.printf("My name is %s and age is %d my marks: %.2f", "Golu Kumar", 20, 89.56f);
        pw.printf("My name is %s and age is %d my marks: %.3f", name, age, marks);
        pw.print("My name is "+name+" and age is "+age+ " my marks: "+marks);

        pw.close();
    }
}