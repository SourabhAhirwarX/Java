// a declared method in an interface is implicitly 'public abstract'...
// apply public access modifier, while providing implementation of such inherited method, in your subclass... 

interface X {
    void pro();
}

class A implements X {
    public void pro() {     

    }
}