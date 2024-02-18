class Shape {
    int length;
    int width;
    int height;

    Shape(int length) {
        this.length = length;
    }
    Shape(int length,int width) {
        this(length);
        this.width = width;
    }
    Shape(int length,int width,int height) {
        this(length, width);
        this.height = height;
    }

    public static void main(String[] args) {
        // Shape s1 = new Shape(25);
        // Shape s2 = new Shape(15,10);
        Shape s3 = new Shape(20,10,5);

        // System.out.println(s1.length+"-"+s1.width+"-"+s1.height);
        // System.out.println(s2.length+"-"+s2.width+"-"+s2.height);
        System.out.println(s3.length+"-"+s3.width+"-"+s3.height);
    }
}