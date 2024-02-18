class A {
    Animal pro() {
        return null;
    }
}

class B extends A {
    // overriding method 
    // return type matches with the return type of overriden method
    Animal pro() {
        return null;
    }
}

class Animal {  }

class Dog extends Animal {  }

// Animal x = null;