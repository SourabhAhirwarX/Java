/*

*/

import java.util.Arrays;

class A {
    public static void main(String[] args) {
        Student[] x = {
            new Student("yashit", 34),
            new Student("mohit", 18),
            new Student("jignesh", 25),
            new Student("vikram", 20),
            new Student("ganesh", 27)
        };

        for(Student s : x ) {
            System.out.println(s);
        }

        System.out.println("************************");

        Arrays.sort(x);         // Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable
        for(Student s : x ) {
            System.out.println(s);
        }
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
        return name+"~"+age;
    }
}