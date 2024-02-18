class A {
    static void pro(Animal... x) {
        for(Animal t : x) {
            System.out.println(t);
        }

        System.out.println("----------------");
    }

    public static void main(String[] args) {
        pro();
        pro(new Dog());
        pro(new Dog(), new Animal(), new Cat(), new BDog());

        Animal[] r = {new Dog(), new Animal(), new Cat(), new BDog()};
        pro(r);
    }
}

class Animal {  }
class Cat extends Animal {  }
class Dog extends Animal {  }
class BDog extends Dog {   }
class Cow extends Animal {  }