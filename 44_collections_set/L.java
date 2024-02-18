// implementing the remove() method of Collection interface,
// on our own class Student...

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

    public String toString() {
        return name +" ~ "+ age;
    }
}