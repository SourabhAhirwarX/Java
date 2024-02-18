/*

*/

import java.util.ArrayList;
import java.util.Collections;

class A {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("mohan", 23));
        list.add(new Student("rohan", 17));
        list.add(new Student("tohan", 10));
        list.add(new Student("sohan", 21));
        list.add(new Student("gohan", 13));

        System.out.println(list);

        Collections.sort(list);      // this will sort the list
        System.out.println(list);
    }
}

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
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