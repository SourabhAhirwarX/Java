class A {
    public static void main(String[] args) {
        int x = (int)'A'; 
        // Integer x = (Integer)'A';        // NOT OK       // error: incompatible types: char cannot be converted to Integer
        // Integer x = (int)'A'; 
    }
}