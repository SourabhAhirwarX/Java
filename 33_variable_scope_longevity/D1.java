class A {
    void pro() {
        if(12>11) {
            System.out.println(x);    // error: cannot find symbol
            for(int i=0; i<3; i++) {
                System.out.println(x);     // error: cannot find symbol
                while(i<2) {
                    int x = 9;
                    System.out.println(x);
                    i++;
                }
            }
        }
        System.out.println(x);    // error: cannot find symbol
    }

    public static void main(String[] args) {
        A a = new A();
        a.pro();
    }
}