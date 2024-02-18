import java.io.EOFException;
import java.io.FileNotFoundException;

class A {
    void pro() throws FileNotFoundException {

    }
}

class B extends A {     // Newer Exception in declaration is not allowed
    void pro() throws FileNotFoundException, EOFException {     // error: pro() in B cannot override pro() in A

    }
}