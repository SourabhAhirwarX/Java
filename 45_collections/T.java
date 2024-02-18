/*

*/

import java.util.HashMap;

class A {
    public static void main(String[] args) {
        HashMap<Student, College> map = new HashMap<Student, College>();
            
        map.put(new Student("om", 19), new College("JEC"));
        map.put(new Student("ram", 21), new College("SRIT"));
        map.put(new Student("om", 19), new College("Global"));

        System.out.println(map);
        
        Student x = new Student("om", 19);
        System.out.println(map.containsKey(x));
        System.out.println(map.remove(x));
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
        return name + " ~ " + age;
    }
}

class College {
    String name;

    College(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}