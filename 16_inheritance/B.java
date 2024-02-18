// if you forget to declare a parent class then
// Alpha class Object(Ultimate parent in java) will be the parent class.
// Here you can access the members of parent class Object,
// using the object of child class(A).

    // hashcode()
    // toString()
    // equals()
    // getClass()
    // notify()
    // notifyAll()
    // clone()
    // wait()
    // wait(a, b)
    // wait(a, b, c)

class A {
    void pro() {
        System.out.println("Hello...");
    }

    public static void main(String[] args) {
        A x = new A();

        x.pro();

        // x.abc();    // error: cannot find symbol
        
        System.out.println(x.hashCode());   // methods of alpha class(Object)
        System.out.println(x.toString());
        System.out.println(x.getClass());
        System.out.println(x.equals(x));
    }
}