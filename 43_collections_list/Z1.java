import java.util.ArrayList;

class A {
    public static void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList();

        list1.add(23);
        list1.add(53);
        list1.add(75);
        list1.add(92);

        System.out.println(list1);

        ArrayList list2 = new ArrayList(list1);

        list2.add("golu");
        list2.add("sohan");

        System.out.println(list2);
    }
}