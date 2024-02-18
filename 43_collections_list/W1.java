/*
    here, we want to check whether the two objects a and b are equal,
    we, are thinking that compiler will check the properties inside these objects
    but, compiler only checks the reference codes only...
                                    Object class
                              boolean  ->  equals​(Object obj)
                              
                                    class String 
                              boolean  ->  equals​(String name)
    
    so, equal() method returns false because both reference variabel points on different objects...
     
    Conclution:- compiler only checks the refernce codes are same or not.
            But, now we had overrided the equals() method of Object class 
            therefore, now it will checks whether the properties of the objects are equal or not...
*/

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // equal method of Object class 
    public boolean equals(Object o) {
        // equal method of String class 
        return this.name.equals(((Student)o).name) && this.age == ((Student)o).age;
    }

    public static void main(String[] args) {
        Student a = new Student("golu", 12);
        Student b = new Student("golu", 12);
        // Student b = new Student("monu", 12);

        System.out.println(a);      // this will print the refernce codes of a 
        System.out.println(b);      // this will print the refernce codes of b
        
        System.out.println(a.equals(b));        // here, now it will checks whether the properties of the objects are equal or not
        System.out.println(a == b);             // this will check the equality between a and b i.e. their reference code which always false because, no two variable can attain same reference code
    }
}