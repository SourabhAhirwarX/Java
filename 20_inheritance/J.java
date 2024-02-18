class X {     }

class C extends X implements A {     }

class D extends C implements F {     }

class E extends D implements A, F {     }

interface G {     }

interface A extends G {     }

interface F extends G {     }

interface T {     }

class Y {
    public static void main(String[] args) {
        // E x = new E();
        Object x = new E();

        System.out.println(x instanceof Object);    // true
        System.out.println(x instanceof X);         // true
        System.out.println(x instanceof C);         
        System.out.println(x instanceof D);
        System.out.println(x instanceof A);
        System.out.println(x instanceof F);
        System.out.println(x instanceof G);

        System.out.println(x instanceof T);
    }
}