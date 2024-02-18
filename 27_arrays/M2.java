class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // overriding the toString() method of Object class
    public String toString() {
        return name+" - "+age;
    }
}

class A {
    public static void main(String[] args) {
        Student s1 = new Student("bholu",45);
        Student s2 = new Student("golu",18);

        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);
        System.out.println(s2.toString());
    }
}