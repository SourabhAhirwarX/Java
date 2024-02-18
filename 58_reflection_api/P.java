import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Abc {
    public static final int y = 99;
    public static final transient float j = 2.34f;
}

class A {
    public static void main(String[] args) throws IllegalAccessException {
        Class Klass = Abc.class;

        Abc x = new Abc();

        Field[] arr = Klass.getDeclaredFields();

        for(Field f : arr) {
            int encVal = f.getModifiers();

            // System.out.println(Modifier.toString(encVal));

            System.out.println(Modifier.toString(encVal)+" "+f.getType().getName()+" "+f.getName()+" = "+f.get(x));
        }
    }
}