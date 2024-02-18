class A {
    class B {
        int y = 11;
        
        void info() {
            System.out.println("Hello");
        }
    }

    void pro() {
        // error: cannot find symbol
        info();  
        System.out.println(y); 
    }

    public static void main(String[] args) {
        A  x = new A();
        x.pro();
    }
}