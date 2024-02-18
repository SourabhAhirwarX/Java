class X {
    int y = 98;
}

class A extends X {
    int y = 45;
    
    // just for confustion we are not using this info() method anywhrer...
    void info() {
        int y = 56;
    }

    void pro() {
        int y = 23;

        System.out.println(y);
        System.out.println(this.y);
        System.out.println(super.y);
    }

    public static void main(String[] args) {
        A a = new A();
        a.pro();
    }
}