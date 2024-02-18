class A {   }

class G extends A {   }

class B extends A {   }

class C extends B {   }

class X {
    public static void main(String[] args) {
        Object x = new C();
        System.out.println(x);
                        // C-Obj IS-A Object
        System.out.println(x instanceof Object);
                        // C-Obj  IS-A  A
        System.out.println(x instanceof A);
                        // C-Obj  IS-A  B
        System.out.println(x instanceof B);
                        // C-Obj  IS-A  C
        System.out.println(x instanceof C);

                        // C-Obj  IS-A  G
        System.out.println(x instanceof G);
    }
}