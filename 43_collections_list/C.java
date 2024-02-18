/*
    * Both sides must be of same type <E> => place holder(reference type)
                Error -> incompatible type
    * there is no Parent child Concept in Connectors
                Exception -> ArrayStoreException
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();        
        // ArrayList<Number> list = new ArrayList<Integer>();          // error: incompatible types: ArrayList<Integer> cannot be converted to ArrayList<Number>
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(12));

        // in case of arrays it is possible that we can store child type elements in parent type array
        Number[] x = new Integer[3];
        System.out.println(x[0] + " ~ " + x[1] + " ~ " + x[2]);

        Animal[] y = new Dog[2];   
        y[0] = new Dog(); 
        y[1] = new Cat();       // Exception in thread "main" java.lang.ArrayStoreException: Cat
        // because at run time when it get to know that y is of dog type, so at that time it will generate ASE
    }
}

class Animal { }
class Cat extends Animal {       }
class Dog extends Animal {       }