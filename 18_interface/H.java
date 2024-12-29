// variables declared inside an interface are static final...

interface X {
    int a = 34;
}

class A {
    public static void main(String[] args) {
        System.out.println(X.a);

        X.a = 45;   // error: cannot assign a value to final variable a
    }
}