class A {
    static int x = 90; // class level variable

    public static void main(String[] args) {
        pro();  // we are trying to call a non-static method in a staic context(i.e. class context)
    } 

    void pro() {
        System.out.println("Hello");
    }
}

// error: non-static method pro() cannot be referenced from a static context