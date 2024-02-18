class A {
    static void pro(int y) {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        pro(12, 15);

        int[]  x = {12, 13, 15};
        pro(x);
    }
}

// error: method pro in class A cannot be applied to given types;
// reason: actual and formal argument lists differ in length