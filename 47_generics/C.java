import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        // int[] x = new byte[2];       // Type mismatch: cannot convert from byte[] to int[]

        Animal[] x = new Cat[3];

        x[0] = new Cat();
        x[1] = new Dog();   // Exception in thread "main" java.lang.ArrayStoreException: Dog
    }
}

class Animal {      }
class Cat extends Animal {      }
class Dog extends Animal {      }