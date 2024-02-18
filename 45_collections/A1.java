/*


*/

import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<Student>();

        set.add(new Student("mohan", 12));             
        set.add(new Student("tohan", 14));             
        set.add(new Student("sohan", 10));            
        set.add(new Student("gohan", 15));
        set.add(new Student("rohan", 13));

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
        return name + " ~ " + name;
    }
}