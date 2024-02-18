import java.io.EOFException;
import java.io.IOException;

class A {
    void pro() throws IOException {

    }
}

class B extends A {     
    void pro() throws EOFException {    // Narrower Exception in declaration is allowed

    }
}