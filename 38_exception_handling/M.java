class A {
    public static void main(String[] args) {
        if(args.length == 0) {
            throw new MissingCommandLineException("Argument Expected but not found");
        }
        System.out.println("A");
    }
}

class MissingCommandLineException extends RuntimeException {
    // MissingCommandLineException() {

    // }

    MissingCommandLineException(String message) {
        super(message);
    }
}