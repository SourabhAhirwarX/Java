class A {
    static void pro(int[] y) {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        // pro();
        // pro(12);
        // pro(12, 13, 15);

        // int[] x = {12, 14, 18};
        int[] x = {};
        pro(x);
    }
}

// C.java:8: error: incompatible types: int cannot be converted to int[]
// error: method pro in class A cannot be applied to given types;

// reason: actual and formal argument lists differ in length