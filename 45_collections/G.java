/*

*/

import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<Student>();

        set.add(new Student("mohan", 12));
        set.add(new Student("tohan", 14));
        set.add(new Student("rohan", 10));
        set.add(new Student("gohan", 15));
        set.add(new Student("iohan", 13));

        System.out.println(set);
    }
}

class Student implements Comparable<Student> {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // public int compareTo(Student obj) {
    //     String nm1 = this.name;
    //     String nm2 = obj.name;

    //     return nm1.compareTo(nm2);
    // }
    
    public int compareTo(Student obj) {
        return this.name.compareTo(obj.name);
    }

    public String toString() {
        return name + " ~ " + age;
    }
}