import java.lang.reflect.Field;

class Human {
    public char e = 'A';
    byte t = 1;
}

class User extends Human {
    double r = 8.9;
    public long g = 7;
}

class Student extends User {
    static int y;
    public float j = 5.6f;

    // private String w;
    // Exception in thread "main" java.lang.IllegalAccessException: class A cannot access a member of class Student with modifiers "private"
    
    public Integer q = 23;
    protected String u = "om";
}

class A {
    public static void main(String[] args) throws IllegalAccessException {
        Student st = new Student();
        st.j = 11.23f;
        st.q = 89;

        Class klass = Student.class;

        Field[] fields = klass.getDeclaredFields();

        for(Field fl : fields) {
            System.out.println(fl.getName()+"  -> "+fl.get(st));
        }
    }
}