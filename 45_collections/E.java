/*
    Comparing objects on the basis of their name's
*/

import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(new Student("mohan", 12));             
        set.add(new Student("tohan", 14));            
        set.add(new Student("sohan", 10));            
        set.add(new Student("gohan", 15));
        set.add(new Student("rohan", 13));

        System.out.println(set);
    }
}

// Comparable interface is a functional interface so we must have to override its compareTo() method
class Student implements Comparable {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // overriding the compareTo() method of Comparable Interface
    public int compareTo(Object obj) {
        Student a = this;
        Student b = (Student)obj;

        String nm1 = a.name;
        String nm2 = b.name;

        return nm1.compareTo(nm2);
    }

    public String toString() {
        return name + " ~ " + age;
    }
}