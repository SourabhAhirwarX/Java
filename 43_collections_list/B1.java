/*
    here, we are creating the object of class ArrayList 
    and by using import statement we are importing ArrayList class 
    since, ArrayList is class of util package so we must import it...
    and then, by using add() method we are adding new values to list...

    All reference variable are of object type variable...

    conclution:-  we must have to pass the Integer type values only...
                because, we marked are class as type safe (i.e Integer only allowded)
                we can't pass the non-integer values otherwise it will generate error: i.e. incompatible types...
                therefore, String("golu") and double(45.34) can't be passed
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add("golu");           // error: incompatible types: String cannot be converted to Integer
        list.add(45.18);            // error: incompatible types: double cannot be converted to Integer
        list.add((int)45.18);         // using Type-Casting we can add the bigger data type values also...

        System.out.println(list);
    }
}