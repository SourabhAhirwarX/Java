class Student {
    String name;
    int age;

    static int maxAge = 20;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "mohan";
        s1.age = 12;

        Student s2 = new Student();
        s2.name = "ram";
        s2.age = 18;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s2.name);
        System.out.println(s2.age);

        System.out.println(Student.maxAge);
    }
}