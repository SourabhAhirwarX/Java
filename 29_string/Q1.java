class A {
    public static void main(String[] args) {
        String x = "Golu";
        String y = "Kumar";
        String t = "GoluKumar"; // string constant pool

        String z = x.concat(y); // heap
    
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println(z == t);
        System.out.println(t.equals(z));
    }
}