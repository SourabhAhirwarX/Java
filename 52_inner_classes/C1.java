class A {
    //instance level member variable
    int x = 901;

    //instance level member method
    void pro() {
        System.out.println("Hello");
    }

    //instance level member class
    class B {

    }

    public static void main(String[] args) {
        A obj = new A();
        
        // error: non-static variable this cannot be referenced from a static context
        // this.new B();
        System.out.println(obj.new B());
        
        // Case 2:
        // pro();
        obj.pro();   

        // Case 1:
        System.out.println(obj.x);        
        // System.out.println(x);        
    }
}