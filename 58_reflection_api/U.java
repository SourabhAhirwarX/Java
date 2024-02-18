import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

class Student {
    private Student(String userName, String password) throws ClassCastException, ClassNotFoundException, IllegalArgumentException {
        
    }

    public Student(String userName, String password, String email, String contact) throws ArithmeticException, NullPointerException {
        
    }

    protected Student(int userId) throws ArrayIndexOutOfBoundsException {

    }
}

class A {
    public static void main(String[] args) {
        Class Klass = Student.class;

        Constructor[] mts = Klass.getDeclaredConstructors();

        for(Constructor mt : mts) {
            Type[] paramTypes = mt.getGenericParameterTypes();

            int c = 0;
            System.out.print(Modifier.toString(mt.getModifiers())+" "+mt.getName()+"(");

            for(Type type : paramTypes) {
                System.out.print(type.getTypeName()+((c++ == paramTypes.length-1)?"":", "));
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