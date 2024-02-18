package a1.a2.a3;

class C extends A {
    public static void main(String[] args) {
        // correct this will compile because,
        // class C is in the same package,
        // so, it can access protected members as well
        
        A x = new A();
        // C x = new C(); // it is also possible
        System.out.println(x.t);
    }    
}