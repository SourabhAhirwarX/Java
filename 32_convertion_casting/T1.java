class Animal {      }
class Dog extends Animal {      }
class Cat extends Animal {      }

class X {
    public static void main(String[] args) {
        Animal x = new Cat(); // widenning convertion
        Dog y = (Dog) x;    // narrowing convertion     
        // ClassCastException: class Cat cannot be cast to class Dog
    }
}