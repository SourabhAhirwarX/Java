class A {
    public static void main(String[] args) {
        for(int i=0; i<128; i++) {
            System.out.print((char)i + " - " + i + "  ");
        }

        for(int i=128; i<256; i++) {
            System.out.print((char)i + " - " + i + "  ");
        }
    }
}