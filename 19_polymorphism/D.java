class A {   }

class G extends A {   }

class B extends A {   }

class C extends B {   }

class X {
    public static void main(String[] args) {
        C x = new C();
        B y = new B();
        G z = new G();

        System.out.println(x instanceof A);
        System.out.println(y instanceof A);
        System.out.println(z instanceof A);
    }
}