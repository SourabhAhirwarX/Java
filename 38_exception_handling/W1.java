import java.io.EOFException;
import java.io.FileNotFoundException;

class A {
    void pro() throws FileNotFoundException, EOFException {

    }
}

class B extends A {     
    void pro() {    // Fewer Exception in declaration is allowed

    }
}