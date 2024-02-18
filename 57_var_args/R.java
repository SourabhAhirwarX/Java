class A {
    static void pro(String[] x) {

    }

    static void pro(String... y) {

    }

    public static void main(String[] args) {
        pro(new String[]{"a1", "a2"});
    }
}

// error: cannot declare both pro(String...) and pro(String[]) in A