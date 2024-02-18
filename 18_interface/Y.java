interface D {   }
interface E {   }

class B {    }
class C {    }

// class A extends B {    }     // OK
// class A extends B, C {     }    // Not OK

// class A extends D {     }      // error: no interface expected here
// class A extends D, E {     }   // Not OK

// class A implements B {     }      // Not OK
// class A implements B, C {     }   // Not OK

// class A implements D {     }       // OK
// class A implements D, E {     }    // OK