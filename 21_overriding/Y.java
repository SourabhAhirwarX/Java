class A {
    public static void main(String[] args) {
        CarRental cr = new CarRental();

        Car car = null;

        car = cr.rentSportsCar();
        car.driveCar();

        car = cr.rentLuxuryCar();
        car.driveCar();

        car = cr.rentSpaceCar();
        car.driveCar();
    }
}

class CarRental {
    SportsCar rentSportsCar() {
        SportsCar x = new SportsCar();

        return x;
    }

    LuxuryCar rentLuxuryCar() {
        LuxuryCar x = new LuxuryCar();
        
        return x;
    }

    SpaceCar rentSpaceCar() {
        SpaceCar x = new SpaceCar();
        
        return x;
    }
}


class Car {
    void driveCar() {
        System.out.println("driverCar in Car");
    }
}

class SportsCar extends Car {
    void driveCar() {
        System.out.println("driverCar in SportsCar");
    }
}

class LuxuryCar extends Car {
    void driveCar() {
        System.out.println("driverCar in LuxuryCar");
    }
}

class SpaceCar extends Car {
    void driveCar() {
        System.out.println("driverCar in SpaceCar");
    }
}