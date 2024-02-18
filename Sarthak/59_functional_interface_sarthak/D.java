//functional Interface

// Annotation: @FunctionalInterface

@FunctionalInterface
interface Mno {
    void pro();
    void info();
}

// error: Unexpected @FunctionalInterface annotation
// Mno is not a functional interface
// multiple non-overriding abstract methods found in interface Mno