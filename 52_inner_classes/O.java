// here, we get to know that we can access private members of an inner class to outer class

class A {
    private int n; 

    private void info() {
        System.out.println("hiiii");
    }

    class B {
        private void pro() {
            System.out.println(n);
            info();
        }
    }

    public static void main(String[] args) {        
        A z = new A();
        z.n = 100;
        B t = z.new B();

        t.pro();
    }
}