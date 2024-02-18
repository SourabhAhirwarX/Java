import java.lang.reflect.Method;

class Student {
    static void pro() {

    }

    public void info() {

    }

    void abc() {

    }

    private void pqr() {

    }

    protected void wwf() {

    }

    public static void main(String[] args) {
        
    }
}

class A {
    public static void main(String[] args) {
        Class Klass = Student.class;

        Method[] methods = Klass.getDeclaredMethods();

        for(Method m : methods) {
            System.out.println(m.getName());
        }
    }
}