class A {
    public static void main(String[] args) {
        // Short a = Short.valueOf(56);    // error: no suitable method found for valueOf(int)
        Short a = Short.valueOf((short) 56);
        
        System.out.println(a);
    }
}