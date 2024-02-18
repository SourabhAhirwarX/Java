class A {
    void pro() {
        int x = 9;

        if(12<13) {
            int x = 11;   // error: variable x is already defined in method pro()
            System.out.println(x);
        }
    }
}