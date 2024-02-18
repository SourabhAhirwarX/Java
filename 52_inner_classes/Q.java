class A {
    int y = 8;

    class B extends Z {
        // int y = 80;

        void info() {
            // int y = 800;
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        new A().new B().info();
    }
}

class Z {
    // it will consider this variable, if it doesn't find in its method body, 
    // then it search in its class, 
    // if it doesn't find it then only it will check in its parent class
    // if it doesn't found it in parent class, then it will finally checks the outer class

    int y = 44;          // check this for outer class also
}