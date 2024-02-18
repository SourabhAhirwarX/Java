interface Jumpable {     }

class SportsCar implements Jumpable {     }

class Ball implements Jumpable {     }

class Rabbit implements Jumpable {     }

class A {
    public static void main(String[] args) {
        SportsCar scar = new SportsCar();
        Ball ball = new Ball();
        Rabbit rabbit = new Rabbit();

        A.handleJumpable(scar);
        A.handleJumpable(ball);
        A.handleJumpable(rabbit);
    } 

    //...METHOD OVERLOADING...//
    static void handleJumpable(Rabbit rabbit) {
        // ------------some code
    }
    static void handleJumpable(Ball ball) {
        // ------------some code
    }
    static void handleJumpable(SportsCar sportsCar) {
        // ------------some code
    }
}