class A {
    int u = 3;

    class B {
        int u = 30;

        class C {
            int u = 300;

            class D {
                int u = 3000;

                void pro() {
                    int u = 30000;
                    System.out.println(u);
                    System.out.println(this.u);
                    System.out.println(C.this.u);
                    System.out.println(B.this.u);
                    System.out.println(A.this.u);
                }
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        A.B.C.D d = c.new D();

        d.pro();
    }
}
