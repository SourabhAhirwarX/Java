import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.Console;

class Student {
    String name;
    int age;
}

class B {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "m@han";
        s.age = 100;

        System.out.println(s.name+" - "+s.age);
    }
}

class A {
    public static void main(String[] args) {
        Student s = new Student();
        
        Console c = System.console();

        System.out.println("Enter Student name: ");
        String name = c.readLine();

        Pattern p = Pattern.compile("^[A-Za-z]+$");
        Matcher m = p.matcher(name);

        if(m.find()) {
            s.name = name;
        }

        System.out.println("Enter Student age: ");
        int age = Integer.parseInt(c.readLine());

        if(age > 3 && age < 20) {
            s.age = age;
        }

        System.out.println(s.name+" - "+s.age);
    }
}