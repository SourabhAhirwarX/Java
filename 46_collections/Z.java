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

        Arrays.sort(x);    

        Student s = new Student("jignesh", 25);
        System.out.println(Arrays.binarySearch(x, s));
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
        return name+"~"+age;
    }
}