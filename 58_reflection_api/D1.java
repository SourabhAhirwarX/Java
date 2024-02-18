import java.lang.reflect.Modifier;

public final class D1 {

}

class A {
    public static void main(String[] args) {
        Class klass = D1.class;

        int val = klass.getModifiers();

        System.out.println(Modifier.toString(val));
    }
}