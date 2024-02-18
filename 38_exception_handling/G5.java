class X {
    X() throws ClassNotFoundException {
        Class.forName("Golu");
        System.out.println("A");
    }
}

class A extends X {   
    A() throws ClassNotFoundException {       
        super();    
    }      
    public static void main(String[] args) {
        System.out.println("B");
        A a = new A();          // error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
        System.out.println("C");
    }
}