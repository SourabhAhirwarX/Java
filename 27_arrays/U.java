// Access through instantiation
// in Array of student objects
// on the fly array object creation

class A {
    public static void main(String[] args) {
        Student[] x = {
                        new Student("om",14), 
                        new Student("nonu",45), 
                        new Student("chhagan",18)
                    };

        for(int i=0; i<x.length; i++) {
            System.out.println("Student name: "+x[i].name+"---Student age: "+x[i].age);
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
        return name+"~"+age;
    }
}