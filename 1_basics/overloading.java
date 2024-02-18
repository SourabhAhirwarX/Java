class Car {
    /*private*/ void pro() {
        System.out.println("Inside car pro");
    }
}

class Hyundai extends Car {
    public static void main(String[] args) {
        Hyundai i20 = new Hyundai();
        i20.pro();
    }
}