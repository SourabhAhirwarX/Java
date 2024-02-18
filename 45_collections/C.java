/*
    as we want to Compare objects on the basis of their names,
*/

class A {
    public static void main(String[] args) {
        Student x = new Student("mohan", 12);
        Student y = new Student("mohan", 14);
        Student z = new Student("sohan", 13);
        
        System.out.println(x.compareTo(y));
        System.out.println(x.compareTo(z));
        System.out.println(z.compareTo(x));
    }
}

class Student {
    String name;
    Integer age;

    // static String abc = " abcdefghijklmnopqrstuvwxyz";

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Object obj) {
        Student a = this;
        // Student b = obj;        // error: incompatible types: Object cannot be converted to Student
        Student b = (Student)obj;

        String nm1 = a.name;
        String nm2 = b.name;

        return nm1.compareTo(nm2);  // compareTo() of String class
    }

    public String toString() {
        return name + " ~ " + age;
    }
}