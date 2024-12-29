// declared methods in an interface are implicitly abstract...
// subclass is responsible for implementation 
// if subclass fails to implement such abstract methods... then the complilation will fail

interface X {
    void pro();
}

class A implements X {
    
}

// error: A is not abstract and does not override abstract method pro() in X