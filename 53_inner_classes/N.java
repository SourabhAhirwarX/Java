class A {
    void pro() {
        //Method local anonymous inner class
        Z a = new Z() {
            void pro() {
                System.out.println("Hello");
            }
        };
    }
}

class Z {
    void pro() {
        System.out.println("Hi");
    }
}