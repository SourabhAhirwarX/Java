class A {
    class B extends X {
        // internally this is happening
        // B() {
        //     super();
        // }
    }
    public static void main(String[] args) {
        
    }
}

class X {
    // This will not work
    X(int y) {

    }

    // This will work
    // X() {

    // }
}