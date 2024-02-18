import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.Console;

class Student {
    // Step-1: Mark private
    private String name;        //--------------private
    private int age;            //--------------private

    // Step-2: Generate getter and setter method
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class A {
    public static void main(String[] args) {
        Student s = new Student();
        
        Console c = System.console();

        System.out.println("Enter Student name: ");
        s.name = c.readLine();                      //----------------------------- X

        System.out.println("Enter Student age: ");
        s.age = Integer.parseInt(c.readLine());     //----------------------------- X

        System.out.println(s.name+" - "+s.age);     //----------------------------- X
    }
}