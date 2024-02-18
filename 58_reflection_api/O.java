import java.lang.reflect.Field;

class Student {
    private String name = "golu";
    public int age = 21;
    protected String degree = "BTech";
    String branch = "CS";

    Student(String name, int age, String degree, String branch) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.branch = branch;
    }
}

class A {
    public static void main(String[] args) throws IllegalAccessException {
        Class Klass = Student.class;

        Student st = new Student("Golu Ji", 22, "MTech", "EC");

        Field[] arr = Klass.getDeclaredFields();

        for(Field f : arr) {
            // System.out.println(f);
            // System.out.println(f.getName()+" ~ "+f.get(st));
            // System.out.println(f.getType());

            System.out.println(f.getType().getName()+" "+f.getName()+" = "+f.get(st));
        }
    }
}