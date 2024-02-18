class A {
    public static void main(String[] args) {
        String x = new String("om");
        String y = new String("om");
        String z = new String("om");

        // so in this case a String class object will we created in String Constant pool
        // and 3 different objects will be created in the heap area whose reference code will assigned to x, y and z resp.

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}