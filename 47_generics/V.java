import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        RentCar rc = new RentCar();

        Car car = new Car();
        rc.addCar(car);

        Car x = rc.getCar();
    }
}

class Bus {     }

class RentBus {
    ArrayList<Bus> buses = new ArrayList<Bus>();

    void addBus(Bus bus) {
        buses.add(bus);
    }

    Bus getBus() {
        return buses.remove(0);
    }
}

class Car {     }

class RentCar {
    // Pool of car i.e cars
    ArrayList<Car> cars = new ArrayList<Car>();

    // method for adding new cars to the pool of cars
    void addCar(Car car) {
        cars.add(car);
    }

    // method for removing car from the pool cars
    Car getCar() {
        return cars.remove(0);
    }
}