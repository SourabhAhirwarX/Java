class A {
    class T {

    }
}

class Z {
    void pro() {
        A x = new A();      // access through instantiation
        System.out.println(x);
        
        A.T t = x.new T();
        System.out.println(t);
    }

    public static void main(String[] args) {
        Z z = new Z();
        z.pro();
    }
}