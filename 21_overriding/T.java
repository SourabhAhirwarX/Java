class S {
    static void pro() {

    }
}

public class T extends S {
    void pro() {

    }
}

// error: pro() in R cannot override pro() in S
// overridden method is static