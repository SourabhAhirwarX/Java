class Student {
    String name;
    int age;
}

class A {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "ganesh";
        s.age = 12;

        System.out.println(s.name);
        System.out.println(s.age);
        
        // Shallow cloning
        Student t = s;
        
        t.name = "hitesh";
        t.age = 17;
        
        System.out.println(s.name);
        System.out.println(s.age);
    }
}