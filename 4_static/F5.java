class Circle {
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 3;

        Circle c2 = new Circle();
        c2.radius = 5;

        c1.calcArea();
        c2.calcArea();

        //definition of a circle is a string constant
        //definition will not change if you call the method on difference circle object with diff. dius
        //better you declare such method static
        defineCircle();
        defineCircle();
    }

    static void defineCircle() {
        System.out.println("Circle is a....");
    }

    void calcArea() {
        System.out.println(pi * radius * radius);
    }
}