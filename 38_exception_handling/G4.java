class X {
    X() throws ClassNotFoundException {
        Class.forName("Golu");
        System.out.println("A");
    }
}

class A extends X {   
    A() {       
        try {
            super();    // error: call to super must be first statement in constructor
        } catch(ClassNotFoundException e) {

        }
    }      
    public static void main(String[] args) {
        System.out.println("B");
        A a = new A();
        System.out.println("C");
    }
}