class Student {
    String name = "Modi";
    int age = 18;

    Student() {
        System.out.println(this.name+"~~~~~~~~~~~~~~~");
        System.out.println(this.age+"~~~~~~~~~~~~~~~");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        
        System.err.println(s1.name);
        System.out.println(s1.age);
    }
}