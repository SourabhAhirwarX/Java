class X {
    X() throws ClassNotFoundException {
        Class.forName("Golu");
        System.out.println("A");
    }
}

class A extends X {   
    A() {       
        super();    // error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
    }      
    public static void main(String[] args) {
        System.out.println("B");
        A a = new A();
        System.out.println("C");
    }
}