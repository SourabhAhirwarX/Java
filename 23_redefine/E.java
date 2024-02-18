class A {
    void pro(SportsCar sportsCar) {
        System.out.println("SportsCar");
    }

    void pro(Car car) {
        System.out.println("Car");
    }
}

class X {
    public static void main(String[] args) {
        Car car = new SportsCar();

        A x = new A();

        x.pro(car);
        x.pro((SportsCar)car);
    }
}

class Car {

}

class SportsCar extends Car {
    
}