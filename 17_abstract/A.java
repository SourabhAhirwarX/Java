/*
    basic meaning of abstract is incomplete.
    basically, abstraction means providing only the essential information and hiding the implementation details

    Abstract class:-
        an abstract class is the class which can not be instantiated(i.e. we can not create its object)
        it can contain any type of methods(i.e. public, protected, default, private, abstract, static, final)
        it can consist of abstract as well as non abstract method also

    Abstract method:-
        an abstract method is the method that doesn't have the body (i.e. it can't be defined, declare only)
        it can only be defined in its sub class
        when a class inherit the abstract class then it is mandatory to provide the definition(override) of all the abstract methods of the abstract class.
*/

class A {
    void pro();     // attempting to declare a method
                    // in normal class we can't declare a method we have to provide its definition
}

// error: missing method body, or declare abstract