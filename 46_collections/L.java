/*

*/

import java.util.TreeMap;

class A {
    public static void main(String[] args) {
        TreeMap<Student, Integer> map = new TreeMap<Student, Integer>();

        map.put(new Student("meena", 19), 1);
        map.put(new Student("jay", 21), 5);
        map.put(new Student("kumud", 23), 4);
        map.put(new Student("preet", 22), 7);
        map.put(new Student("ishita", 18), 2);

        System.out.println(map);

        Student x = new Student("Lakhan", 20);
        // Student x = new Student("nishchay", 20);
        // Student x = new Student("Harshit", 20);
        System.out.println(map.ceilingEntry(x)); 
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
        // return this.age.compareTo(s.age);
    }

    public String toString() {
        return name + " ~ " + age;
    }
}