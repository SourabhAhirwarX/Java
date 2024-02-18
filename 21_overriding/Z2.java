class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat Sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog Sound");
    }
}

class X {
    public static void main(String[] args) {
        Animal a = null;

        a = new Animal();
        a.makeSound();

        a = new Cat();
        a.makeSound();

        a = new Dog();
        a.makeSound();

        //Runtime Polymorphism: decide at runtime, which method(instance) version to call 
        //Runtime Polymorphism uses Dynamic Method Dispatch to decide which method version to call 
    }
}