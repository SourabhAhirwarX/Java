class Student {
    String name;
    int age;
}

class A {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student();

        s.name = "ganesh";
        s.age = 12;

        System.out.println(s.name);
        System.out.println(s.age);
        
        //Shallow cloning
        // Student t = s;

        //Deep cloning
        Student t = (Student)s.clone();
        
        t.name = "hitesh";
        t.age = 17;
        
        System.out.println(s.name);
        System.out.println(s.age);
    }
}