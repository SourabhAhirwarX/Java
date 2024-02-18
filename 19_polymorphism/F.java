class A {
    void proA() {
        System.out.println("proA");
    }
}

class B extends A {
    void proB() {
        System.out.println("proB");
    }
}

class C extends B {
    void proC() {
        System.out.println("proC");
    }
}

class X {
    public static void main(String[] args) {
        C x = new C();

        x.proC();
        x.proB();
        x.proA();
        System.out.println(x.toString());
    }
}