import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

class Y implements Serializable {

}

// x is a singleton class(Lazy initialization)

class X extends Y {
    //step-2: create a public static refernce variable of class X and assign an X obj;
    private static X obj;

    //step-1: declare all of your constructors as private
    private X() {

    }

    public static X getInstance() {
        if(obj == null) {
            obj = new X();
        }
        return obj;
    }

    protected Object readResolve() {
        return obj;
    }
}

class A {
    public static void main(String[] args) throws Exception {
        X x1 = X.getInstance();
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