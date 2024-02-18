// variables declared inside an interface are by default static, final, public...

interface X {
    int a = 34;
}

class A {
    public static void main(String[] args) {
        System.out.println(X.a);
    }
}