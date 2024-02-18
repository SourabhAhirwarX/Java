import java.io.EOFException;
import java.io.IOException;
import java.io.FileNotFoundException;

class A {
    void pro() throws IOException {

    }
}

class B extends A {     
    void pro() throws FileNotFoundException, EOFException {    // Narrower Exception in declaration is allowed

    }
}