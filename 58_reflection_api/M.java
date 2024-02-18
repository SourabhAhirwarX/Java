import java.lang.reflect.Constructor;

class Shape {
    int l;
    int w;
    int h;

    Shape() {

    }

    public Shape(int l) {
        this.l = l;
    }

    public Shape(int l, int w) {
        this.l = l;
        this.w = w;
    }

    Shape(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
}

class A {
    public static void main(String[] args) {
        Class Klass = Shape.class;

        Constructor[] cons = Klass.getConstructors();

        for(Constructor con : cons) {
            System.out.println(con);
            System.out.println(con.getName());
        }
    }
}