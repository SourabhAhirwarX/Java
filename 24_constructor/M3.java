class Student {
    String name = "golu";
    int age = 45;

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(this.name);       // error: non-static variable this cannot be referenced from a static context
        System.out.println(this.age);        // error: non-static variable this cannot be referenced from a static context
    }
}