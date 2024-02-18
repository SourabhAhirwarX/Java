class A {
    static void pro(int w, int... r) {
        System.out.println(w);

        for(int t : r) {
            System.out.println(t+" ");
        }
    }

    public static void main(String[] args) {
        // pro(89, 12, 34, 56, 78);
        // pro(89);
        pro();
    }
}

// error: method pro in class A cannot be applied to given types;

// reason: actual and formal argument lists differ in length