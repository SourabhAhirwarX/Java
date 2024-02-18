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

*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        Student s1 = new Student("mohan", 23);
        Student s2 = new Student("sohan", 9);
        Student s3 = new Student("rohan", 18);
        Student s4 = new Student("gohan", 12);  
        Student s5 = new Student("tohan", 17);

        ArrayList list = new ArrayList();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        
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

    // here, we are overriding the toString() method of alpha Class Object properly for printing the values accordingly...
    // try it with comment and without comment

    public String toString() {
        return "Name: " + name + " ~~~~~ Age: " + age;
    }
}