class Student {
    String name;
    int age;

    Student(String name, int age) {     // variable name and parameter name are same
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("raghav", 15);

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}