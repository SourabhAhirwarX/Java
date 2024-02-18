class Animal {

}

class Dog extends Animal {

}

class BDog extends Dog {

}

class Cat extends Animal {

}

class Car {

}

class Rohit {
    public static void main(String[] args) {
        BDog x = new BDog();

        // instanceof is an operator which check whether it comes in its inheritance tree or not return boolean
        System.out.println(x instanceof BDog);
        System.out.println(x instanceof Dog);
        System.out.println(x instanceof Animal);
        System.out.println(x instanceof Object);
        // wrapper class
        Integer i = 23;
        System.out.println(i instanceof Number);
        
        // System.out.println(x instanceof Cat);      // error: incompatible types: BDog cannot be converted to Cat       
        
        // System.out.println(x instanceof xyz);      // error: cannot find symbol
        // System.out.println(x instanceof Car);      // error: incompatible types: BDog cannot be converted to Car
    }
}