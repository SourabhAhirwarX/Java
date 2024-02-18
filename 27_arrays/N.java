class A {
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);
        System.out.println(args[0]);
        // ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
    }
}

// javac N.java
// java A
// java A asdf
// java A asdf jkl
// java A 45