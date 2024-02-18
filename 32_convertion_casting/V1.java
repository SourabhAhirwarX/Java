interface A {       }
class B implements A {      }
class C extends B {     }

class X {
    public static void main(String[] args) {
        A x = new C();
        B y = (B) x;    // Widdening conv.
        System.out.println(y);
        C z = (C) x;    // Narrowing conv.
        System.out.println(y);
    }
}