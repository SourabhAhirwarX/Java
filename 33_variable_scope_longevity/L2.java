class X {
    int y = 98;
}

class A extends X {
    int y = 45;
    
    void info() {
        int y = 56;
    }

    void pro() {
        //int y = 23;

        System.out.println(y);
        System.out.println(this.y);
        System.out.println(super.y);
    }

    public static void main(String[] args) {
        A a = new A();
        a.pro();
    }
}