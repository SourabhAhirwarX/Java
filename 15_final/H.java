final class X {

}

class A {
    public static void main(String[] args) {
        X t = createAnObjectOfClassX();
    }

    static X createAnObjectOfClassX() {
        X a = new X();

        return a;
    }
}