import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

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
            Type[] paramTypes = mt.getGenericParameterTypes();

            int c = 0;
            System.out.print(Modifier.toString(mt.getModifiers())+" "+mt.getReturnType().getName()+" "+mt.getName()+"(");

            for(Type type : paramTypes) {
                System.out.print(type.getTypeName()+((c++==paramTypes.length-1)?"":", "));
            }

            System.out.print(") throws ");

            c = 0;
            Type[] excptTypes = mt.getGenericExceptionTypes();
            for(Type type : excptTypes) {
                System.out.print(type.getTypeName()+((c++==excptTypes.length-1)?"":", "));
            }

            System.out.println("\n");
        }
    }
}