interface X {
    void info();
    void pro();
}

class A implements X {
    public void info() {

    }
}

// error: A is not abstract and does not override abstract method pro() in X