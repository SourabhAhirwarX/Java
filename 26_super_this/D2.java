class X {
    int t = 999;
}

class A extends X {
    int t = 222;
    
    void pro() {
        int t = 746;
        System.out.println(t);
    }

    public static void main(String[] args) {
        A x = new A();
        x.pro();
    }
}