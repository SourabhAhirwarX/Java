class A {   }

class G extends A {   }

class B extends A {   }

class C extends B {   }

class X {
    public static void main(String[] args) {
        Object a = new A();
        Object b = new B();
        Object c = new C();
        
        Object d = new String();

        Object e = new G();

        A x = new B();
        A y = new C();
        A z = new G();
    }
}