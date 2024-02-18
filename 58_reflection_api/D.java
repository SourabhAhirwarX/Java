public abstract class D {

}

class A {
    public static void main(String[] args) {
        Class klass = D.class;

        System.out.println(klass);
        System.out.println(klass.getModifiers());
    }
}