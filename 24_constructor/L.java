class Student {
    String name;
    int age;
    
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(s1.name);
        System.out.println(s1.age);

        s1.name = "golu";
        s1.age = 21;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}