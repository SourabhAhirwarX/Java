class A {
    public static void main(String[] args) {

        byte b = (byte)128;
        short s = (short)32768;
        char c = (char)-1;

        System.out.println(b);
        System.out.println(s);
        System.out.println((int)c);

        //type casting exempted because the value assigned using assignment operator
        //and the value is a constant value within range of the variable type;
    }
}