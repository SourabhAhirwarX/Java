/*
    Duplicate Records not allowded!
*/

import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();

        set.add(new Student("mohan", 12));
        set.add(new Student("sohan", 18));
        set.add(new Student("rohan", 11));
        set.add(new Student("gohan", 9));
        set.add(new Student("tohan", 22));
        set.add(new Student("tohan", 12));

        System.out.println(set);
    }
}

class Student {
    String name;
    int age;

    static String abc = " abcdefghijklmnopqrstuvwxyz";

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        int val = 0;

        for(int i=0; i<name.length(); i++) {
            val += abc.indexOf(name.charAt(i));
        }

        return val;
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj instanceof Student) {
            Student a = this;
            Student b = (Student)obj;           

            String nm1 = a.name;
            String nm2 = b.name;

            if(nm1.equals(nm2)){
                flag = true;
            }
        }

        return flag;
    }

    public String toString() {
        return name +" ~ "+ age;
    }
}