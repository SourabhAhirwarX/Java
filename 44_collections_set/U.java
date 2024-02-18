/*
    comparation on the basis of name and age both...
*/

import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();

        set.add(new Student("mohan", 12));
        set.add(new Student("sohan", 18));
        set.add(new Student("hanmo", 11));
        set.add(new Student("gohan", 9));
        set.add(new Student("hamno", 22));
        set.add(new Student("hanmo", 11));

        System.out.println(set);

        Student s = new Student("gohan", 24);
        System.out.println(set.contains(s));
        System.out.println(set.remove(s));

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
        
        return val+age;
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj instanceof Student) {
            Student a = this;
            Student b = (Student)obj;

            String nm1 = a.name;
            String nm2 = b.name;

            int ag1 = a.age;
            int ag2 = b.age;

            if(nm1.equals(nm2) && ag1==ag2) {
                flag = true;
            }
        }
        
        return flag;
    }

    public String toString() {
        return name + " ~ " + age;
    }
}