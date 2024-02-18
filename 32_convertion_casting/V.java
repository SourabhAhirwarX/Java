interface A {       }
class B implements A {      }
class C extends B {     }

class X {
    public static void main(String[] args) {
        A x = new C();
        B y = x;    // error: incompatible types: A cannot be converted to B
    }
}