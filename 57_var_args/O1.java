class A {
    public static void main(String[] args) {
        LivingBeing lb = new Cat();

        // Animal y = lb;                          // error: incompatible types: LivingBeing cannot be converted to Animal
        Animal y = (Animal)lb;
    }
}

class LivingBeing {     }
class Animal extends LivingBeing {      }
class Cat extends Animal {      }
class Dog extends Animal {      }
class BDog extends Dog {      }
class Cow extends Animal {      }