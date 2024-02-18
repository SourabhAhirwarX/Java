/*

*/

import java.util.PriorityQueue;

class A {
    public static void main(String[] args) {
        PriorityQueue set = new PriorityQueue();

        set.offer(new Student("mohan", 12));
        set.offer(new Student("tohan", 14));
        set.offer(new Student("rohan", 10));
        set.offer(new Student("gohan", 15));
        set.offer(new Student("iohan", 13));

        System.out.println(set.poll());
        System.out.println(set.poll());
        System.out.println(set.poll());
        System.out.println(set.poll());
        System.out.println(set.poll());
    }
}

class Student implements Comparable<Student> {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    } 

    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }

    public String toString() {
        return name + " ~ " + age;
    }
}