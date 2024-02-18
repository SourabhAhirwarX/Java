class A {
    public static void main(String[] args) {
        CarRental cr = new CarRental();

        Car car = null;

        car = cr.rentCar(1);
        car.driveCar();

        car = cr.rentCar(2);
        car.driveCar();

        car = cr.rentCar(3);
        car.driveCar();
    }
}

class CarRental {
    Car rentCar(int n) {
        Car car = null;

        if(n == 1) {
            car = new SportsCar();
        } else if(n == 2) {
            car = new LuxuryCar();
        } else {
            car = new SpaceCar();
        }        

        return car;
    }

    // SportsCar rentSportsCar() {
    //     SportsCar x = new SportsCar();

    //     return x;
    // }

    // LuxuryCar rentLuxuryCar() {
    //     LuxuryCar x = new LuxuryCar();
        
    //     return x;
    // }

    // SpaceCar rentSpaceCar() {
    //     SpaceCar x = new SpaceCar();
        
    //     return x;
    // }
}


class Car {
    void driveCar() {
        System.out.println("driverCar in Car ~~~~");
    }
}

class SportsCar extends Car {
    void driveCar() {
        System.out.println("driverCar in SportsCar ~~~~");
    }
}

class LuxuryCar extends Car {
    void driveCar() {
        System.out.println("driverCar in LuxuryCar ~~~");
    }
}

class SpaceCar extends Car {
    void driveCar() {
        System.out.println("driverCar in SpaceCar ~~~");
    }
}