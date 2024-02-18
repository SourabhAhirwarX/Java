class A {
    static void pro(String...[] x) {
        for(String[] a : x) {
            for(String b : a) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] t = {{"a1", "a2", "a3", "a4", "a5"}, {"b1", "b2", "b3"}, {"x1", "x2", "x3", "x4"}};

        pro(t);
    }
}

// error: <identifier> expected
// static void pro(String...... x)