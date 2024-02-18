class A {
    A(int x) {
        System.out.println("Hello");
    }
}

class B extends A {
    public static void main(String[] args) {
        System.out.println("1");

        B y = new B();              // error: constructor A in class A cannot be applied to given types
        // as the default constructor of class be will find the default constructor of parent class which is not present so it will generate error
        
        System.out.println("2");
    }
}