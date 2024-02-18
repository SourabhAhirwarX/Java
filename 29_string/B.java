class A {
    public static void main(String[] args) {
        String x = new String("Kartik");
        // an object of class String will we created in string constant pool and an object of String is created in heap area as well. 
        // so, therefore x is pointing to the heap area object created

        System.out.println(x);
    }
}