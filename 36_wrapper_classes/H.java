class A {
    public static void main(String[] args) {
        pro();
    }

    static int pro() {
        Integer x = Integer.valueOf(234);
        
        return x; //Autoboxing->unboxing
    }
}