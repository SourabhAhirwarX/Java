/*
    basically, their is no inbuilt way of comparing the user defined objects,
    we must have to handle it on our own.
*/

import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(new Student("mohan", 12));            // Exception in thread "main" java.lang.ClassCastException: 
        set.add(new Student("tohan", 14));            // class Student cannot be cast to class java.lang.Comparable 
        set.add(new Student("sohan", 10));            // (Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
        set.add(new Student("gohan", 15));
        set.add(new Student("rohan", 13));

        System.out.println(set);
    }
}

class Student {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ~ " + name;
    }
}