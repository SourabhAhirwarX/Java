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
        A x = new C();

        //x.proC();   // doesn't have proC, proB method in C, B or not inherited from the parent
        //x.proB();
        x.proA();
        System.out.println(x.toString());
    }
}