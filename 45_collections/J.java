/*
    here also we don't know on what basis we have to compare the objects
*/

import java.util.PriorityQueue;

class A {
    public static void main(String[] args) {
        PriorityQueue set = new PriorityQueue();

        set.offer(new Student("mohan", 12));        // Exception in thread "main" java.lang.ClassCastException:  
        set.offer(new Student("tohan", 14));        // class Student cannot be cast to class java.lang.Comparable
        set.offer(new Student("rohan", 10));        // (Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
        set.offer(new Student("gohan", 15));
        set.offer(new Student("iohan", 13));

        System.out.println(set.poll());
        System.out.println(set.poll());
        System.out.println(set.poll());
        System.out.println(set.poll());
        System.out.println(set.poll());
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
        return name + " ~ " + age;
    }
}