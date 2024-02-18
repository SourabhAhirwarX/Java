class A {
    public static void main(String[] args) {
        System.out.println(1);
        B.pro();
        System.out.println(2);
    }
}

class B {
    static void pro() {
        System.out.println(3);
        C.info();
        System.out.println(4);
    }
}

class C {
    static void info() {
        System.out.println(5);
        int s = 14/0;
        System.out.println(6);
    }
}