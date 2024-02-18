class Human implements Cloneable {
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student extends Human {
    private static Student st;
    
    String name;
    int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Student getInstance() {
        if(st == null) {
            st = new Student("mohan", 12);
        }

        return st;
    }
}

class A {
    public static void main(String[] args) {
        Student s1 = Student.getInstance();
        try {
            Student s2 = (Student)s1.clone();

            System.out.println(s1);
            System.out.println(s2);
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}