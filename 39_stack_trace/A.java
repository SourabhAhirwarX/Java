class A {
    public static void main(String[] args) {
        System.out.println(1);
        pro();
        System.out.println(2);
    }

    static void pro() {
        System.out.println(3);
        info();
        System.out.println(4);
    }

    static void info() {
        System.out.println(5);
        int y = 12/0;
        System.out.println(6);
    }
}

/* 
    1
    3
    5
    AE
*/