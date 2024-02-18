// Golu is a Functional Interface containing exactly one declared(abstract) method
// a warning we are expecting... because the interface is having more than one declared(abstract) methods

@FunctionalInterface
interface Golu {
    void process();
    void info();
}

// error: Unexpected @FunctionalInterface annotation
// @FunctionalInterface
// ^
// Golu is not a functional interface,
// multiple non-overriding abstract methods found in interface Golu