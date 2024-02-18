/*

*/

import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1-NameAO, 2-NameDO, 3-AgeAO, 4-AgeDO: ");
        int val = sc.nextInt();
        sc.close();
        
        Comparator comp = null;

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

        TreeSet set = new TreeSet(comp);

        set.add(new Student("mohan", 12));
        set.add(new Student("tohan", 14));
        set.add(new Student("rohan", 10));
        set.add(new Student("gohan", 15));
        set.add(new Student("iohan", 13));

        System.out.println(set);
    }
}

class NameAscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        String nm1 = s1.name;
        String nm2 = s2.name;

        return nm1.compareTo(nm2);
    }
}

class NameDscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        String nm1 = s1.name;
        String nm2 = s2.name;

        return nm2.compareTo(nm1);
    }
}

class AgeAscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        Integer ag1 = s1.age;
        Integer ag2 = s2.age;

        return ag1.compareTo(ag2);
    }
}

class AgeDscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        Integer ag1 = s1.age;
        Integer ag2 = s2.age;

        return ag2.compareTo(ag1);
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