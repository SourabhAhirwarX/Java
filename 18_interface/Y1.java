interface D {   }
interface E {   }

class B {    }
class C {    }

// interface D extends A {    }          // Not OK
// interface D extends A, B {     }      // Not OK

// interface D extends E {     }         // OK
// interface D extends E, F {     }      // OK

// interface D implements A {     }      // Not OK
// interface D implements A, B {     }   // Not OK

// interface D implements E {     }       // Not OK
// interface D implements E, F {     }    // Not OK