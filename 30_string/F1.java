class A {
    public static void main(String[] args) {
        char[] x = {'a', 'm', 'a', 'n'};
        String t = "aman";                  // string constant pool
        
        String y = String.valueOf(x);       // this will create object in heap

        System.out.println(y);
        System.out.println(t == y);
    }
}