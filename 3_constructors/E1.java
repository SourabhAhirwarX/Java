class Student {
    // data member
    String name;
    int age;

    // custom constructor
    Student(String nm, int ag) {
        name = nm;
        age = ag;
    }

    Student() {

    }

    public static void main(String[] args) {
        Student s1 = new Student("mohan", 23);
        Student s2 = new Student();

        System.out.println(s1);
        System.out.println(s2);
        // since, s1 is of reference type(local level variable) therefore, it will print the reference code of Student object.
    }
}