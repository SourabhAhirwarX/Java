//Singleton class
class B {
    //step 1: declare all the constructors private ....
    // so that no class can use it either by instantiation or by inheritance
    private B() {

    }
}

class A {
    public static void main(String[] args) {
        B x1 = new B();
        B x2 = new B();
        B x3 = new B();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}