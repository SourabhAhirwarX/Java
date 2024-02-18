/*
    Question
    _(space) -> 32
    1 -> 48
    A -> 65
    a -> 97
*/

import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(" W");
        set.add(" a");
        set.add("T");
        set.add(" 2");
        set.add("5");
        set.add("c");
        
        System.out.println(set);       // 2 W a 5 T c
    }
}