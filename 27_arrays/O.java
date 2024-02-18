class A {
    public static void main(String[] args) {
        System.out.println(args.length);
        
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}

// java A 
// ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0

// java A motu patlu golu bholu

// java A motu patlu 
// ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2