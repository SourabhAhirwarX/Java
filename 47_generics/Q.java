import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<? super Dog> list1 = new ArrayList<Dog>();
        // ArrayList<? super Dog> list2 = new ArrayList<Cat>();
        ArrayList<? super Dog> list3 = new ArrayList<Animal>();
        ArrayList<? super Dog> list4 = new ArrayList<LivingBeing>();
        ArrayList<? super Dog> list5 = new ArrayList<Object>();
    }
}

class LivingBeing {     }
class Animal extends LivingBeing {      }

class Cat extends Animal {      }
class Cow extends Animal {      }
class Dog extends Animal {      }
class BDog extends Dog {      }