class A {
    void pro() {
        int x = 9;
        if(12>11) {
            System.out.println(x);
            for(int i=0; i<3; i++) {
                System.out.println("~~~~ "+x);
                while(i<2) {
                    System.out.println("$$$$$$$$ "+x);
                    i++;
                }
            }
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        A a = new A();
        a.pro();
    }
}