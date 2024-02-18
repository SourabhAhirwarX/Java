class A {
    public static void main(String[] args) {
        T t = new T();

        t.pro();
    }
}

interface Z {
    void pro();
}

class T implements Z {
    public void pro() {
        System.out.println("Hi");
    }
}