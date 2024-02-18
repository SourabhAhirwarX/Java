import java.lang.reflect.Method;

abstract class Student {
    private static void signin(String userName, String password) throws ClassCastException, ClassNotFoundException, IllegalArgumentException {

    }

    public synchronized static final void signup(String userName, String password, String email, String contact) throws ArithmeticException, NullPointerException {

    }

    protected abstract void showProfile() throws ArrayIndexOutOfBoundsException;
}

class A {
    public static void main(String[] args) {
        Class Klass = Student.class;

        Method[] mts = Klass.getDeclaredMethods();

        for(Method mt : mts) {
            // System.out.println(mt);
            System.out.println(mt.getName());
        }
    }
}