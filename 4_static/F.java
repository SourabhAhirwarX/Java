class Circle {
    int radius;
    static float pi = 3.14f;
    
    void calcArea() {
        System.out.println(pi * radius * radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 3;

        Circle c2 = new Circle();
        c2.radius = 5;

        c1.calcArea();
        c2.calcArea();
    }
}