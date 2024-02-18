class Student {
    String name;
    int age;

    Student(String nm, int ag) {
        name = nm;
        age = ag;
    }

    public static void main(String[] args) {
        Student s1 = new Student("golu",17);
        
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}