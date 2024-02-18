import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;

    private static Student y;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public String toString() {
    //     return name + " - " + age;
    // }

    public static Student getInstance() {
        if(y == null) {
            y = new Student("Yam", 1000);
        }

        return y;
    }
}

class A {
    public static void main(String[] args) throws Exception {
        Student y = Student.getInstance();
        Student z;

        new ObjectOutputStream(new FileOutputStream(new File("bholu.txt"))).writeObject(y);

        z = (Student)(new ObjectInputStream(new FileInputStream(new File("bholu.txt")))).readObject();
    
        System.out.println(y);
        System.out.println(z);
    }
}