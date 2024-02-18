class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends User {
    String degree;
    String branch;

    Student(String name,int age, String degree, String branch) {
        super(name, age);
        this.degree = degree;
        this.branch = branch;
    }
}

class Teacher extends User {
    String qualification;
    int salary;

    Teacher(String name,int age, String qualification, int salary) {
        super(name, age);
        this.qualification = qualification;
        this.salary = salary;
    }
}

class X {
    public static void main(String[] args) {
        Student s = new Student("bablu", 17, "BSc", "CS");
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.degree);
        System.out.println(s.branch);

        Teacher t = new Teacher("mohan", 42, "MSc", 180000);
        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.qualification);
        System.out.println(t.salary);
    }
}