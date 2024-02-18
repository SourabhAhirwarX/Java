import java.lang.reflect.Constructor;

enum U {

}

class A {
    public static void main(String[] args) throws Exception {
        Class klass = U.class;

        Constructor[] arr = klass.getDeclaredConstructors();

        arr[0].setAccessible(true);

        U u = (U)arr[0].newInstance();
        // Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects

        System.out.println(u);
    }
}