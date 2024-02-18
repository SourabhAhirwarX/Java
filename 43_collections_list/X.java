/*
    so, here is the final solution for are problem of V.java

    were, we override the toString() method
    as well as overrided the equals() method of Object and String class Accordingly...

    Conclution:- were to use the overriding of methods for getting the proper output.
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        Student s1 = new Student("mohan", 23);
        Student s2 = new Student("sohan", 9);
        Student s3 = new Student("rohan", 18);
        Student s4 = new Student("gohan", 12);
        Student s5 = new Student("tohan", 17);
    
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println(list);

        Student w = new Student("gohan", 18);
        // Student w = new Student("iohan", 18);
        // System.out.println(list.remove(w));
        System.out.println(list.contains(w));       
       
        System.out.println(list);
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age; 
    }

    public String toString() {
        return "Name:"+name+" Age:"+age ;    
    }

    public boolean equals(Object o) {
        Student x = this;
        Student y = (Student)o;

        String nm1 = x.name;
        String nm2 = y.name;

        int ag1 = x.age;
        int ag2 = y.age;

        System.out.println(x.name+"~~~~~"+y.name);      // by, this we just prints all the iterations perfoming over here

        // return nm1.equals(nm2) && ag1==ag2;
        return nm1.equals(nm2);
    }
}