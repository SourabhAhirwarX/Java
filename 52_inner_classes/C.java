class A {
    // instance level member variable
    int x = 90;

    // instance level member method
    void pro() {
        System.out.println("Hello");
    }

    //instance level member class
    class B {

    }

    public static void main(String[] args) {
        // Case 3:
        // error: non-static variable this cannot be referenced from a static context
        // new B();
        // this.new B();
        
        // Case 2:
        // pro();   
        // error: non-static method pro() cannot be referenced from a static context    

        // Case 1:
        // System.out.println(x);
        // non-static variable x cannot be referenced from a static context        
    }
}