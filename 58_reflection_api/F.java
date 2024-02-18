import java.io.Serializable;

class User {

}

class Student extends User implements Serializable, Cloneable {

}

class A {
    public static void main(String[] args) {
        Class klass = Student.class;

        Class k1 = klass.getSuperclass();

        System.out.println(k1);
        System.out.println(k1.getName());

        Class[] kls = klass.getInterfaces();

        for(Class k : kls) {
            System.out.println(k);
            System.out.println(k.getName());
        }
    }
}