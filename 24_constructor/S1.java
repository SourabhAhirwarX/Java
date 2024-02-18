class Student {
    String name;
    int age;
    String degree;
    String branch;
    
    Student(String name, int age, String degree, String branch) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.branch = branch;
    }
}

class Teacher {
    String name;
    int age;
    String qualification;
    int salary;

    Teacher(String name, int age, String qualification, int salary) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class X {
    public static void main(String[] args) {
        Student s1 = new Student("rohan", 21, "BTech", "CSE");

        Teacher t1 = new Teacher("Ramesh", 42, "MTech", 220000);

        System.out.println("...Student Info...");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.degree);
        System.out.println(s1.branch);

        System.out.println("...Teacher Info...");
        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.qualification);
        System.out.println(t1.salary);
    }
}