class Animal {      }
class Dog extends Animal {      }
class Cat extends Animal {      }

class A {
    public static void main(String[] args) {
        System.out.println("A");

        Animal x = new Cat();
        Dog t = (Dog) x;            // Exception in thread "main" java.lang.ClassCastException: class Cat cannot be cast to class Dog (Cat and Dog are in unnamed module of loader 'app')
                                    // at A.main(C.java:10)

        System.out.println("B");
    }
}