class A {   }

class G extends A {   }

class B extends A {   }

class C extends B {   }

class X {
    public static void main(String[] args) {
        C x = new C();
                        // C-obj  IS-A  C
        System.out.println(x instanceof C);

                        // C-obj  IS-A  B
        System.out.println(x instanceof B);

                        // C-obj  IS-A  A
        System.out.println(x instanceof A);

                       // C-obj IS-A Object
        System.out.println(x instanceof Object);

                       // C-obj IS-A G
        // System.out.println(x instanceof G);   // error: incompatible types: C cannot be converted to G
    }
}