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
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("B");
        A a = new A();          
        System.out.println("C");
    }
}