class A {
    public static void main(String[] args) {
        boolean x = !0;     // error: bad operand type int for unary operator '!'
        boolean y = !1;     // error: bad operand type int for unary operator '!'
    
        System.out.println(x);
        System.out.println(y);
    }
}