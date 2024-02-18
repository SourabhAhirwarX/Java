class X {
    int y;
}

class Y extends X {
    @Override
    int y;
}

class A {
    public static void main(String[] args) {
        Y a = new Y();

        a.y = 9;
    }
}

// error: annotation type not applicable to this kind of declaration