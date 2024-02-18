class A {
    Animal pro() {
        return null;
    }
}

class B extends A {
    // overriding method 
    // any sub class which shares inheritance relation with animal 
    // class can be declared as a return type of the overriden method
    BDog pro() {
        return null;
    }
}

class Animal {  }

class Dog extends Animal {  }

class BDog extends Dog {   }

// Animal x = null;