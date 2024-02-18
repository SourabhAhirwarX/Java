//  equals() method implementing...
//  on the basis of name only. 
//  but on different objects their reference code can never be equal.

class A {
    public static void main(String[] args) {
        Student x = new Student("golu", 45);

        A y = new A();

        x.equals(y);
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        Student a = this;
        Student b = (Student)obj;           // Exception in thread "main" java.lang.ClassCastException: class A cannot be cast to class Student (A and Student are in unnamed module of loader 'app')

        String nm1 = a.name;
        String nm2 = b.name;

        return nm1.equals(nm2);
    }

    public String toString() {
        return name +" ~ "+ age;
    }
}