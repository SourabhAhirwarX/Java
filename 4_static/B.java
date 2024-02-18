class Circle {
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 34;

        Circle c2 = new Circle();
        c2.radius = 53;

        System.out.println(c1.radius);
        //System.out.println(c1.pi);    // lower case can be accesible but its not the correct way of accessing
        System.out.println(Circle.pi);
        
        System.out.println(c2.radius);
        //System.out.println(c2.pi);
        System.out.println(Circle.pi);
    }
}