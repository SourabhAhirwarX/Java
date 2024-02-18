class Student {
    String name = "golu";
    int age = 21;

    Student() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(this.getClass());
    }

    public static void main(String[] args) {
        Student s1 = new Student();
    }
}