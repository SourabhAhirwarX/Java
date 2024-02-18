// X is a singleton class (Lazy Initialization)

class X {
    private static X obj;
    
    private X() {

    }

    public static X getInstance() {
        if(obj == null) {
            obj = new X();
        }
        return obj;
    }
}

class A {
    public static void main(String[] args) {
        X x1 = X.getInstance();
        X x2 = X.getInstance();

        System.out.println(x1);
        System.out.println(x2);
    }
}