class LivingBeing {     }
class Animal extends LivingBeing {      }
class Cat extends LivingBeing {     }
class Dog extends LivingBeing {     }
class Cow extends LivingBeing {     }
class BDog extends Dog {
    void pro() {
        System.out.println("Inside pro");
    }
}

class A {
    public static void main(String[] args) {
        LivingBeing x = new BDog();
        x.pro();    // error: cannot find symbol
    }
}