class Circle {
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 3;

        Circle c2 =new Circle();
        c2.radius = 5;

        calcArea(c1);
        calcArea(c2);
    }

    static void calcArea(Circle x) {
        System.out.println(pi * x.radius * x.radius);
    }
}