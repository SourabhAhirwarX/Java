class X {
    private static X x;

    private X() {

    }

    //Lazy Initialization...
    public static X getInstance() {
        if(x == null) {
            x = new X();
        }

        return x;
    }
}

class A {
    public static void main(String[] args) {
        X a1 = X.getInstance();
        X a2 = X.getInstance();
        X a3 = X.getInstance();
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}