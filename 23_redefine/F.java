class A {
    // method overloading
    static void pro(SportsCar sportscar) {
        System.out.println("SportsCar");
    }

    static void pro(Car car) {
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

// In case of Overloading we will check the Varible refernce type 
//      Car car = new SportsCar()
//  i.e, in this case the pro method of Car parameterised method will be accessed
// overall, the reference type is checked in case of overloading...