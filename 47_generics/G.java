import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<Animal>();

        list.add(new Cat());
        list.add(new Dog());
        list.add(new Cow());
        list.add(new Animal());

        System.out.println(list);
    }
}

class Animal {      }
class Cat extends Animal {     }
class Dog extends Animal {      }
class BDog extends Dog {      }
class Cow extends Animal {      }