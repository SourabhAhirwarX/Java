// here, for every new object the value of pi will always be initializes...
// for same job we are reinitializing it multiple times.

class Circle {
    int radius;
    float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 34;

        Circle c2 = new Circle();
        c2.radius = 53;

        System.out.println(c1.radius);
        System.out.println(c1.pi);
        System.out.println(c2.radius);
        System.out.println(c2.pi);
    }
}


/*
    class A {
        int a = 90;            // intstance level variable
        static int c = 435;    // class level variable
        
        A() {
            float x = 4353f;    // local level variable
        }
    
        void pro() {
            int b = 445;       // local level variable
        }
        
    }
*/