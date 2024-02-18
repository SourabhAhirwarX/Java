class A {
    public static void main(String[] args) {
        //Case 1:
        // byte j = 23;        
        // Byte x = Byte.valueOf(j);
        // Byte y = Byte.valueOf(j);

        byte j = 127;
        Byte x = Byte.valueOf(j);
        Byte y = Byte.valueOf(j);

        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}