class X {
    public static void main(String[] args) {
        Y y = new Y();
        System.out.println(y.t);
    }
}

// Try this out commented and without commenting it.
// class Y {
//     int t = 45;
// }

// first it will check in its own class
// then it will check in its source file
// then it will check in its same package