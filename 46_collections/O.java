/*

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class A {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("golu", 23));
        list.add(new Student("patlu", 17));
        list.add(new Student("matu", 19));
        list.add(new Student("titu", 21));
        list.add(new Student("bablu", 13));

        System.out.println(list);

        // Collections.sort(list, new NameSort());
        Collections.sort(list, new AgeSort());

        System.out.println(list);
    }
}

class NameSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class AgeSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age.compareTo(s2.age);
    }
}

class Student {
    String name;
    Integer age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ~ " + age;
    }
}