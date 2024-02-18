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
        Student[] x = new Student[2];

        System.out.println(x[0]);
        System.out.println(x[1]);

        x[0] = new Student("golu",45);
        x[1] = new Student("bholu",18);

        System.out.println(x[0].name+" ~ "+x[0].age);
        System.out.println(x[1].name+" ~ "+x[1].age);
    }
}