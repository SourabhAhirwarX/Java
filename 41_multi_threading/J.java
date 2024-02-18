class A {
    int j = 10;
    public static void main(String[] args) {
        System.out.println("A");
        
        A x = new A();
        
        System.out.println(x.j);
        x.pro();

        System.out.println(x.j);
        System.out.println("B");
    }

    synchronized void pro() {
        System.out.println("C");

        synchronized(this) {
            j = 89;
        }

        System.out.println("D");
    }
}