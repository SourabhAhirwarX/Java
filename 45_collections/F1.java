/* 
    its just the trial version,
    nothing new.
*/

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Comparator;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1-NameAO, 2-NameDO, 3-AgeAO, 4-AgeDO");
        int val = sc.nextInt();
        sc.close();

        Comparator comp = null;

        switch(val) {
            case 1: comp = new NameAscSort();
                    break;
            case 2: comp = new NameDscSort();
                    break;
            case 3: comp = new AgeAscSort();
                    break;
            case 4: comp = new AgeDscSort();
        }

        TreeSet set = new TreeSet(comp);

        set.add(new Student("Shivayu", 21));
        set.add(new Student("Ayush", 19));
        set.add(new Student("Piyush", 20));
        set.add(new Student("Gaurav", 21));
        set.add(new Student("Vaibhav", 22));

        System.out.println(set);
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
        return name + "~" + age;
    }
}

class NameAscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        return (((Student)o1).name).compareTo(((Student)o2).name);
    }
}

class NameDscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        return (((Student)o2).name).compareTo(((Student)o1).name);
    }
}

class AgeAscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        return (((Student)o1).age).compareTo(((Student)o2).age);
    }
}

class AgeDscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        return (((Student)o2).age).compareTo(((Student)o1).age);
    }
}