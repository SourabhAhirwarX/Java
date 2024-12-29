package b1.b2;

class D {
    public static void main(String[] args) {
        B x = new B();  
        System.out.println(x.t);
    }  
}

//protected// error: t has protected access in A
//public// easily accessible
//default// error: t is not public in A; cannot be accessed from outside package
//private// error: t has private access in A