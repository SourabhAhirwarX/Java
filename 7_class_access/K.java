// Student Is-A pen

class Student extends Pen {        // error: cannot find symbol
    public static void main(String[] args) {
        Student p = new Student ();
        p.write();         // error: cannot find symbol
    }
}

class Pen {
    void write() {
        /////
        /////
    }
}