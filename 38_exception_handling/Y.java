import java.io.EOFException;
import java.io.IOException;
import java.io.FileNotFoundException;

class A {
    void pro() throws EOFException {

    }
}

class B extends A {     // error: pro() in B cannot override pro() in A
    void pro() throws IOException {    // Wider Exception in declaration is not allowed

    }
}

// same, narrower, fewer 
// newer, wider