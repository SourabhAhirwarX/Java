/*

*/

import java.util.HashMap;

class A {
    public static void main(String[] args) {
        HashMap<Student, College> map = new HashMap<Student, College>();
            
        map.put(new Student("om", 19), new College("JEC"));
        map.put(new Student("ram", 21), new College("SRIT"));
        map.put(new Student("omi", 19), new College("Global"));

        System.out.println(map);

        
        College x = new College("Global");
        System.out.println(map.containsValue(x));
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

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj instanceof Student) {
            Student s1 = this;
            Student s2 = (Student) obj;

            String nm1 = s1.name;
            String nm2 = s2.name;

            if(nm1.equals(nm2)) {
                flag = true;
            }
        }

        return flag;
    }

    public int hashCode() {
        int val = 0;

        for(int i=0; i<name.length(); i++) {
            val += abc.indexOf(name.charAt(i));
        }

        return val;
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

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj instanceof College) {
            String nm1 = this.name;
            String nm2 = ((College)obj).name;

            if(nm1.equals(nm2)) {
                flag = true;
            }
        }

        return flag;
    }

    public String toString() {
        return name;
    }
}