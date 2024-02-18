class User {
    String name;
    int age;

    void bones() {
        System.out.println("206 bones in every human");
    }
}

class Student extends User {
    String degree;
    String branch;

    Student(String name,int age, String degree, String branch) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.branch = branch;
    }
}

class Teacher extends User {
    String qualification;
    int salary;

    Teacher(String name,int age, String qualification, int salary) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class X {
    public static void main(String[] args) {
        Student s = new Student("Modi", 17, "BSc", "CS");
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.degree);
        System.out.println(s.branch);
        s.bones();

        Teacher t = new Teacher("Amar", 42, "MSc", 180000);
        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.qualification);
        System.out.println(t.salary);
        s.bones();
    }
}