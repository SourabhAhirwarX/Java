class A {
    static void pro(Animal... x) {
        for(Animal t : x) {
            System.out.println(t);
        }
        System.out.println("+++++++++++");
    }

    public static void main(String[] args) {
        LivingBeing lb = new Cat();

        pro(new Dog(), new Animal(), new Cat(), new BDog(), lb);
    }
}

class LivingBeing {     }
class Animal extends LivingBeing {      }
class Cat extends Animal {      }
class Dog extends Animal {      }
class BDog extends Dog {      }
class Cow extends Animal {      }


// error: method pro in class A cannot be applied to given types;
        
// reason: varargs mismatch; LivingBeing cannot be converted to Animal