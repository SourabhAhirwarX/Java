import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(22);
        list1.add(56);

        ArrayList<Float> list2 = new ArrayList<Float>();
        list2.add(4.5f);
        list2.add(11/7f);
        list2.add(0.75f);

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("a");
        list3.add("b");
        list3.add("c");

        process(list1);
        process(list2);
        process(list3);
    }
  
    static <T> void process(ArrayList<T> list) {
        for(T t : list) {
            System.out.println(t);
        }

        T x = list.get(0);
        System.out.println(x);
    }
}