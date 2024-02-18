class A {
    public static void main(String[] args) {
        int x = 1;
        
        byte b = x;
        short s = x;
        char c = x;

        System.out.println(b);
        System.out.println(s);
        System.out.println(c);

        //type casting exempted because the value assigned using assignment operator
        //and the value is a constant value within range of the variable type;
    }
}

//error: incompatible types: possible lossy conversion from int to byte/short/char