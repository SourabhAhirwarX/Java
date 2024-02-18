class A {
    static void pro(Animal... x) {
        for(Animal t : x) {
            System.out.println(t);
        }
        System.out.println("+-------------------+");
    }

    public static void main(String[] args) {
        LivingBeing lb = new Cat();

        pro(new Dog(), new Animal(), new Cat(), new BDog(), (Animal)lb);
    }
}

class LivingBeing {     }
class Animal extends LivingBeing {      }
class Cat extends Animal {      }
class Dog extends Animal {      }
class BDog extends Dog {      }
class Cow extends Animal {      }