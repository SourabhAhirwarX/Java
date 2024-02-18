/* 
    Multiple constructors:  we can create our own multiple constructors in our class.
        But then the compiler doesn't provides the default constructor.
*/


class X {
    // compiler won't provide the constructor(i.e. default constructor) if developer created his/her own constructor... so in that case we have to provide the default constructor definition
    X(int a) {

    }

    public static void main(String[] args) {
        // new X();     // error: constructor X in class X cannot be applied to given types;
                        // required: int
                        // found: no arguments

        new X(12);  
        // we can also create parameterised constructors also...
    }
}