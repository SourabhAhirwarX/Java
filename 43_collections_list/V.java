/*
    here, we are creating objects of Student class i.e. s1,s2,s3,s4 & s5 
    and passing name and age to these objects...
    
    then, printing these objects
    were we created parameterized Constructor of Student class
    so, when we call the Student object then on that Parameterized Constructor called
    and here we Override the toString() method of Class Object 
    so, that we can get the proper Output i.e. name and age...

    Make these objects(s1,s2,s3...) as the member of list of ArrayList interface

                                    Object
                            String  -> toString()
    Conclution:- Override the toString() method for printing the name and age.
                compiler only equates the reference code of the objects not there properties
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        Student s1 = new Student("mohan", 23);
        Student s2 = new Student("sohan", 19);
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

        Student w = new Student("rohan", 18);      // internally the compiler only checks whether the same Object the list contains,
                                                            // i.e. it only check on the basis of reference code, not the properties it contains...

        System.out.println(list.remove(w));             // here we are checking whether the object removed or not from the list
        System.out.println(list.contains(w));           // here we are checking whether the list contains that particular object or not in the list

        System.out.println(list);
    }
} 

class Student {
    String name;
    int age;

    // here, we maked the parameterized constructor of Student class and passed the name and age...
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // here, we are overriding the toString() method of alpha Class properly for printing the variables...
    public String toString() {
        return "Name: " + name + " ~~~~~ Age: " + age;
    }
}