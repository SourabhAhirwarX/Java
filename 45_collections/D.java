/*
    Comparing objects on the basis of their age's
*/

class A {
    public static void main(String[] args) {
        Student x = new Student("mohan", 12);
        Student y = new Student("mohan", 14);
        Student z = new Student("sohan", 12);
        
        System.out.println(x.compareTo(y));
        System.out.println(x.compareTo(z));
        System.out.println(z.compareTo(x));
    }
}

class Student {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // here we have just named it as compareTo no overriding from any class
    public int compareTo(Object obj) {
        return this.age.compareTo(((Student)obj).age);
    }

    public String toString() {
        return name + " ~ " + age;
    }
}