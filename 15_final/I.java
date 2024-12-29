class Y {

}

final class X extends Y {

}

class A {
    public static void main(String[] args) {
        X t = new X();

        Y y = (X)t;
    }
}