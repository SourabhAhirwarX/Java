import java.io.EOFException;
import java.io.FileNotFoundException;

class A {
    void pro() throws FileNotFoundException, EOFException {

    }
}

class B extends A {     // Fewer Exception in declaration is allowed
    void pro() throws FileNotFoundException {    

    }
}