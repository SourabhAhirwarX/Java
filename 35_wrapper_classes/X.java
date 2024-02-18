class A {
    public static void main(String[] args) {
        Number x = 23;
        // boxing then conversion allowed -> 23 is a primitive in type constant can be autoboxed to Integer and 
        // Integer is a subclass of Number... widenning conversion will be performed to assign the 
        // Integer object to Number reference variable

        System.out.println(x);

        Object y = true;
        System.out.println(y);
    }
}