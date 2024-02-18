class A {
    public static void main(String[] args) {
        LivingBeing t = new Cow();

        Animal[] x = {new Animal(), new Cat(), new Cow(), new Dog(), new BDog()};

        for(Animal a : x) {
            System.out.println(a);
        }
    }
}

class LivingBeing {} 
class Animal extends LivingBeing {} 
class Cat extends Animal {} 
class Cow extends Animal {} 
class Dog extends Animal {} 
class BDog extends Dog {}