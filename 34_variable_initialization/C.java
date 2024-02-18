class A {
    public static void main(String[] args) {
        // primitive type variables... not initialized by explicit initialized value
        // they must be initialized
        
        boolean a;
        char b;
        byte c;
        short d;
        int e;
        long f;
        float g;
        double h;

        String i;
        int[] j;

        // since, these are the local level variables so these can be directly accessible
        // and we also studied a rule i.e we must initialize the local level variables...
        
        System.out.println(a);      // error: variable a might not have been initialized
        System.out.println(b);      // error: variable b might not have been initialized
        System.out.println((int)b); // error: variable b might not have been initialized
        System.out.println(c);      // error: variable c might not have been initialized
        System.out.println(d);      // error: variable d might not have been initialized
        System.out.println(e);      // error: variable e might not have been initialized
        System.out.println(f);      // error: variable f might not have been initialized
        System.out.println(g);      // error: variable g might not have been initialized
        System.out.println(h);      // error: variable h might not have been initialized
        System.out.println(i);      // error: variable i might not have been initialized
        System.out.println(j);      // error: variable j might not have been initialized
    }
}