import java.lang.reflect.Method;

class Student {
    void pro() {

    }

    public void info() {

    }

    void abc() {

    }
}

class A {
    public static void main(String[] args) {
        Class Klass = Student.class;

        Method[] methods = Klass.getMethods();

        for(Method m : methods) {
            System.out.println(m.getName());
        }
    }
}