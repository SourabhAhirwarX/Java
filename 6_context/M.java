class A {
    public static void main(String[] args) {
        int a = 9;  // local level variable
    }

    void pro() {
        System.out.println(a);
    }
}

// a is a local variable of main method,
// hence, local variable is not accessible outside the method where the variable is declared.
// local level variable have the block level scope only