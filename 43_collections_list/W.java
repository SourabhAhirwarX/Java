/*
    here, we want to check whether the two objects a and b are equal,
    we, thing that compiler will check the properties inside these objects
    but, compiler only checks the reference codes only...
                                    Object class
                              boolean  ->  equals​(Object obj)
    
    so, equal() method returns false because both reference variabes points on different objects...
     
    Conclution:- compiler only checks the refernce codes are same or not.
*/

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age; 
    }

    public static void main(String[] args) {
        Student a = new Student("om", 12);
        Student b = new Student("om", 12);

        System.out.println(a);      // this will print the refernce codes of a
        System.out.println(b);      // this will print the refernce codes of b
        
        System.out.println(a.equals(b));        // here, we are checking whether the refence codes are same or not , not the properties they contains
        System.out.println(a == b);             // this will check the equality between a and b

        String g = "golu";
        String f = new String("golu");
        System.out.println(g.equals(f));    // this is the equals method of String class
        System.out.println(g == f);
    }
}