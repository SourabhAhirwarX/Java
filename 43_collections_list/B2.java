/*
    here, we are creating the object of class ArrayList 
    and by using import statement we are importing ArrayList class 
    since, ArrayList is class of util package so we must import it...
    and then, by using add() method we are adding new values to list...

    All reference variable are of object type variable...

    conclution:-  we must have to pass the integer type values only...
                because, we maked are class type safe (i.e Integer only allowded)
                we can't pass the non integer values otherwise it will generate error: i.e. incompatible types...
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();       

        list.add(12);
        list.add(45);
        list.add(18);
        list.add(63);
        list.add(12);

        System.out.println(list);
    }
}