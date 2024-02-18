class A {
    Y y = new Y() {
        static int y = 89;
        // modifier 'static' is only allowed in constant variable declarations
    };
}

class Y {

}