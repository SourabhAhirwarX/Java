class A {
    public static void main(String[] args) {
        Animal[] x = new Dog[2];
        x[0] = new Dog();
        x[1] = new Cat();       // Exception : lang.ArrayStoreException: Cat
    }
}

class Animal {}
class Cat extends Animal {}
class Dog extends Animal {}