class A {   }

class G extends A {   }

class B extends A {   }

class C extends B {   }

class X {
    public static void main(String[] args) {
        C a = new C();
        B b = new C();
        A c = new C();
        Object d = new C();

        // G g = new C();      // error: incompatible types: C cannot be converted to G
    }
}