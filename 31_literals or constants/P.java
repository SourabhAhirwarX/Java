/*
    byte is by default signed

                            byte 
    -128,-127,............,-1,0,1,2,............127  
                    signed: 2^7 = 128
                    unsigned: 2^8 = 256  
*/


class A {
    public static void main(String[] args) {
        // char x = 65;
        char x = 'A';

        System.out.println(x);
    }
}