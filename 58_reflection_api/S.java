import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

abstract class Student {
    private static String signin(String userName, String password) throws ClassCastException, ClassNotFoundException, IllegalArgumentException {
        return null;
    }

    public synchronized static final int signup(String userName, String password, String email, String contact) throws ArithmeticException, NullPointerException {
        return 12;
    }

    protected abstract boolean showProfile() throws ArrayIndexOutOfBoundsException;
}

class A {
    public static void main(String[] args) {
        Class Klass = Student.class;

        Method[] mts = Klass.getDeclaredMethods();

        for(Method mt : mts) {
            // System.out.println(Modifier.toString(mt.getModifiers()));
            System.out.println(Modifier.toString(mt.getModifiers())+" "+mt.getReturnType().getName()+" "+mt.getName());
        }
    }
}