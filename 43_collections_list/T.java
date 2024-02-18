/*
    here, we are creating objects of Student class i.e. s1,s2,s3,s4 & s5 
    and passing name and age to these objects...
    
    then, printing these objects
    were we created parameterized Constructor of Student class
    so, when we call the Student object then on that Parameterized Constructor called
    and here we Override the toString() method of Class Object 
    so, that we can get the proper Output i.e. name and age...

                                    Object
                            String  -> toString()
    Conclution:- Override the toString() method for printing the name and age.

*/

class A {
    public static void main(String[] args) {
        Student s1 = new Student("mohan", 23);
        Student s2 = new Student("sohan", 9);
        Student s3 = new Student("rohan", 18);
        Student s4 = new Student("gohan", 12);
        Student s5 = new Student("tohan", 17);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
} 

class Student {
    // properties
    String name;
    int age;

    // here, we created the parameterized constructor of Student class and passed the name and age so, that they will inilitialized by the values passed at the object creation time...
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // behaviour
    // here, we are overriding the toString() method of alpha Class Object, for properly printing the variables...
    public String toString() {
        return "Name: " + name + " ~~~~~ Age: " + age;
    }
}