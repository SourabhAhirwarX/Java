//Singleton class
class B {
    //step 2: create a new object and asign it to a static reference variable
    //Early Initialization
    public static B x = new B();

    //step 1: declare all the constructors private ....
    private B() {

    }
}

class A {
    public static void main(String[] args) {
        B x1 = B.x;
        B x2 = B.x;
        B x3 = B.x;

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}