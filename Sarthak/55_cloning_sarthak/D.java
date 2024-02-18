class Student implements Cloneable {
    String name;
    int age;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
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

        System.out.println("+++++++++++");
        
        System.out.println(s.name);
        System.out.println(s.age);

        System.out.println(t.name);
        System.out.println(t.age);
    }
}