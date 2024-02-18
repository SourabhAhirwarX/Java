/*

*/

import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;

class A {
    public static void main(String[] args) {
        System.out.println("Enter 1-NameAO, 2-NameDO, 3-AgeAO, 4-AgeDO: ");

        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        sc.close();
        
        Comparator<Student> comp = null;

        switch(val) {
            case 1:
                comp = new NameAscSort();
                break;
            case 2:
                comp = new NameDscSort();
                break;
            case 3:
                comp = new AgeAscSort();
                break;
            case 4:
                comp = new AgeDscSort();
                break;
        }

        TreeSet<Student> set = new TreeSet<Student>(comp);

        set.add(new Student("mohan", 12));
        set.add(new Student("tohan", 14));
        set.add(new Student("rohan", 10));
        set.add(new Student("gohan", 15));
        set.add(new Student("iohan", 13));

        System.out.println(set);
    }
}

class NameAscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class NameDscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.name.compareTo(o1.name);
    }
}

class AgeAscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.age.compareTo(o2.age);
    }
}

class AgeDscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.age.compareTo(o1.age);
    }
}

class Student {
    String name;
    Integer age;

    static String abc = " abcdefghijklmnopqrstuvwxyz";

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ~ " + age;
    }
}