import java.lang.reflect.Constructor;

class Student {
    private String name;
    private int age;

    private static Student y;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public static Student getInstance() {
        if(y == null) {
            y = new Student("Yam", 1000);
        }

        return y;
    }
}

class A {
    public static void main(String... args) throws Exception {
        Student y = Student.getInstance();
        Student z;

        Class klass = Student.class;
        Constructor[] arr = klass.getDeclaredConstructors();

        arr[0].setAccessible(true);

        z = (Student)arr[0].newInstance("mohan", 18);
        
        System.out.println(y);
        System.out.println(z);
    }
}