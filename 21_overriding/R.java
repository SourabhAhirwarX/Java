class A {
    protected void pro() {

    }
}

class B extends A {
    // Case3:
    public void pro() {
        
    }

    // Case2:
    // protected void pro() {

    // }

    // Case1: NOT OK attempting to assign weaker access priveleges; was protected
    // void pro() {

    // }
}