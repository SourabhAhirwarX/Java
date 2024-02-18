class A {
    static int i;
    public static void main(String[] args) {
        pro();
    }

    static void pro() {
        System.out.println(i++);
        pro();
    }
}

// StackOverflowError