class A {
    public static void main(String[] args) {
        String x = "mohan";
        // an object of class String will be created to handle the String constant value, in the string constant pool
        // reference code of such String object will be Stored in String/class type reference variable x

        System.out.println(x);  // implicitly toString() is implemented so, it will show the value stored in that variable
    }
}