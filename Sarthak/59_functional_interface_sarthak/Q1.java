interface Uvw {
    void pro();
    void info();
}

class A {
    public static void main(String[] args) {
        Uvw x = () -> System.out.println("Hello");

        x.pro();
    }
}


// error: incompatible types: Uvw is not a functional interface
// multiple non-overriding abstract methods found in interface Uvw