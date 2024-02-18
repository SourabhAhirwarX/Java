// iterating(traversing) over the list
// on our own class...


import java.util.HashSet;
import java.util.Iterator;

class A {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();

        set.add(new Student("mohan", 15));
        set.add(new Student("rohan", 17));
        set.add(new Student("sohan", 18));
        set.add(new Student("tohan", 45));
        set.add(new Student("gohan", 99));

        Iterator itr = set.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
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
        return name +" ~ "+ age;
    }
}