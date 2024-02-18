class A {
    public static void main(String[] args) {
        int x = 1;
        
        byte b = (byte)x;
        short s = (short)x;
        char c = (char)x;

        System.out.println(b);
        System.out.println(s);
        System.out.println(c);

        //type casting exempted because the value assigned using assignment operator
        //and the value is a constant value within range of the variable type;
    }
}
