import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<Cat>();
    }
}

class Animals {     }
class Cat extends Animal {      }

// error: incompatible types: ArrayList<Cat> cannot be converted to ArrayList<Animal>

// elements type on both of the side of assignment operators must be of same type, it doesn't work like the polymorphic assignment