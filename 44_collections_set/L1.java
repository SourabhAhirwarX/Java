//  we have to override the equals method of Object class,
//  because, we want the condition to be checked on the basis of their properties...


import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();

        set.add(new Student("mohan", 15));
        set.add(new Student("rohan", 17));
        set.add(new Student("sohan", 18));
        set.add(new Student("tohan", 45));
        set.add(new Student("gohan", 99));

        System.out.println(set);

        Student w = new Student("rohan", 17);
        System.out.println(set.remove(w));

        System.out.println(set);
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {         // Object class equals()
        // Student a = this;
        // Student b = (Student)obj;

        // String nm1 = a.name;
        // String nm2 = b.name;

        // return nm1.equals(nm2);
        return this.name.equals(((Student)obj).name);   // String class equals()
    }

    public String toString() {
        return name +" ~ "+ age;
    }
}