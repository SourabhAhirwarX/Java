class A {
    static boolean a;
    static char b;
    static byte c;
    static short d;
    static int e;
    static long f;
    static float g;
    static double h;

    static String i;
    static int[] j;

    public static void main(String[] args) {
        A x = new A();
        System.out.println(x.a);

        System.out.println(x.b);
        System.out.println((int)x.b);
        
        System.out.println(x.c);
        System.out.println(x.d);
        System.out.println(x.e);
        System.out.println(x.f);
        System.out.println(x.g);
        System.out.println(x.h);

        System.out.println(x.i);
        System.out.println(x.j);
    }
}