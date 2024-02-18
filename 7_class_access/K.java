// Student IS-A pen

class Student extends Pen {       
    public static void main(String[] args) {
        Student p = new Student();
        p.write(); 
    }
}

class Pen {
    void write() {
        /////
        /////
        System.out.println("write something that i can do");
    }
}