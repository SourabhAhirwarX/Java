class A {
    public static void main(String[] args) {
        if(args.length == 0) {
            throw new MissingCommandLineException();
        }
        System.out.println("A");
    }
}

class MissingCommandLineException extends RuntimeException {
    
}