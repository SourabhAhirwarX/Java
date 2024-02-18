class A {
    static int x = 90;     // class level variable

    public static void main(String[] args) {
        System.out.println(x);
        pro();
    } 

    static void pro() {
        System.out.println("Hello");
        System.out.println(x);
    }
}

// static method, variable, class Name creates class context
// instance level variable, method, object reference variable creates instance context