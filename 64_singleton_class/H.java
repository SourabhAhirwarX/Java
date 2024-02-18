import java.lang.reflect.Constructor;

enum X {
    obj
}

class A {
    public static void main(String[] args) throws Exception {
        X x1 = X.obj;
        X x2 = null;

        // (new ObjectOutputStream(new FileOutputStream("golu.txt"))).writeObject(x1);
        // x2 = (X)(new ObjectInputStream(new FileInputStream("golu.txt"))).readObject();

        Class klass = X.class;
        Constructor[] arr = klass.getDeclaredConstructors();

        arr[0].setAccessible(true);
        
        x2 = (X)arr[0].newInstance();
        
        System.out.println(x1);
        System.out.println(x2);
    }
}

// Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects