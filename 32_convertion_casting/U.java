class Animal {      }
class Dog extends Animal {      }
class Cat extends Animal {      }
class Bus {     }

class X {
    public static void main(String[] args) {
        Animal x = new Bus();   // error: incompatible types: Bus cannot be converted to Animal
    }
}