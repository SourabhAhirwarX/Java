class Vehicle {     }

class Bus extends Vehicle {     }

class Car extends Vehicle {     }

class SportsCar extends Car {     }

class Apple {       }

class X {
    public static void main(String[] args) {
        Vehicle x = new SportsCar();

        if(x instanceof Apple) {    // error: incompatible types: Vehicle cannot be converted to Apple
            System.out.println("SportsCar-object IS-A Apple");
        }
        else {
            System.out.println("SportsCar-object IS-not-A Apple");
        }

        if(x instanceof Bus) {
            System.out.println("SportsCar-object IS-A Bus");
        }
        else {
            System.out.println("SportsCar-object IS-not-A Bus");
        }

        if(x instanceof Vehicle) {
            System.out.println("SportsCar-object IS-A Vehicle");
        }

        if(x instanceof Car) {
            System.out.println("SportsCar-object IS-A Car");
        }

        if(x instanceof SportsCar) {
            System.out.println("SportsCar-object IS-A SportsCar");
        }
    }
}