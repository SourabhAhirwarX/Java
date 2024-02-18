class LivingBeing {     }
class Animal extends LivingBeing {      }
class Cat extends LivingBeing {     }
class Dog extends LivingBeing {     }
class Cow extends LivingBeing {     }
class BDog extends Dog {    }

class A {
    public static void main(String[] args) {
        LivingBeing x = new BDog();
        System.out.println(x);
    }
}