class Animal {      }
class Dog extends Animal {      }
class Cat extends Animal {      }

class X {
    public static void main(String[] args) {
        Animal x = new Cat();
        Dog y = x;    // error: incompatible types: Animal cannot be converted to Dog
    }
}