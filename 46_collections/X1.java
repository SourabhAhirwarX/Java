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

        // Object[] y = x;

        for(Student s : x) {
            System.out.println(s);
        }

        System.out.println("++++++++++++++++++++++++");
        
        Arrays.sort(x);    

        for(Student s : x) {
            System.out.println(s);
        }
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
        return this.age.compareTo(s.age);
    }

    public String toString() {
        return name+"~"+age;
    }
}