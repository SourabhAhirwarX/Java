class Student {
    String name;
    int age;
    String degree;
    String branch;
}

class Teacher {
    String name;
    int age;
    String qualification;
    int salary;
}

class X {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "rohan";
        s.age = 21;
        s.degree = "BTech";
        s.branch = "CSE";

        Teacher t = new Teacher();
        t.name = "Ramesh";
        t.age = 42;
        t.qualification = "MTech";
        t.salary = 220000;

        System.out.println("...Student Info...");
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.degree);
        System.out.println(s.branch);

        System.out.println("...Teacher Info...");
        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.qualification);
        System.out.println(t.salary);
    }
}