import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        Rental<Car> rc = new Rental<Car>();
        Rental<Bus> rb = new Rental<Bus>();

        Car c1 = new Car();
        Car c2 = new Car();
        
        rc.add(c1);
        rc.add(c2);

        Car x = rc.get();
    }
}

class Bus {     }

class Car {     }

class Rental<T> {
    ArrayList<T> pool = new ArrayList<T>();

    void add(T t) {
        pool.add(t);
    }

    T get() {
        return pool.remove(0);
    }
}