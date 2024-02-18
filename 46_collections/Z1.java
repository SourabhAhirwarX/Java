/*

*/

import java.util.Arrays;
import java.util.Comparator;

class A {
    public static void main(String[] args) {
        Student[] x = {
            new Student("yashit", 34),
            new Student("mohit", 18),
            new Student("jignesh", 25),
            new Student("vikram", 20),
            new Student("ganesh", 27)
        };

        // Comparator<Student> comp = new NameSort(); 
        // Comparator<Student> comp = new NameRevSort(); 
        // Comparator<Student> comp = new AgeSort(); 
        Comparator<Student> comp = new AgeRevSort();

        Arrays.sort(x, comp);    
        Student key = new Student("maneesh", 25);
        System.out.println(Arrays.binarySearch(x, key, comp));
    }
}

class NameSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class NameRevSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.name.compareTo(s1.name);
    }
}

class AgeSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age.compareTo(s2.age);
    }
}

class AgeRevSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.age.compareTo(s1.age);
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