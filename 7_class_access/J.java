// Association(Weak part of relation)
// Student HAS-A pen

class Student {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.write();
    }
}

class Pen {
    void write() {
        /////
        /////
        System.out.println("i can write anythink u want");
    }
}