class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class A {
    public static void main(String[] args) {
        Student s1 = new Student("xyz", 12);
        Student s2 = new Student("abc", 18);

        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);
        System.out.println(s2.toString());
    }
}