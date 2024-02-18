package a1.a2.a3;

class C extends A {
    public static void main(String[] args) {
        C x = new C();
        x.pro();
        // x.info();   // cannot find symbol
        x.info1();     // accessing public_private member
        x.self();      // accessing Default member 
    }
}