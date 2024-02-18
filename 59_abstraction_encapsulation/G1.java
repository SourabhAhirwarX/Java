import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.Console;

class Student {
    String name;
    int age;
}

class A {
    public static void main(String[] args) {
        Student s = new Student();
        
        Console c = System.console();

        System.out.println("Enter Student name: ");
        s.name = c.readLine();

        System.out.println("Enter Student age: ");
        s.age = Integer.parseInt(c.readLine());

        System.out.println(s.name+" - "+s.age);
    }
}