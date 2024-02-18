//  Step-1: We have to mark all the constructors as private

class X {
    private X() {

    }
}

class A {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new X();

        System.out.println(x1);
        System.out.println(x2);
    }
}