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
    }
  
    static void process( ArrayList<? extends Number> list) {
        Object obj = list.get(0);

        if(obj instanceof Integer) {
            Integer i = (Integer)obj;
            list.add(34);
        } else if(obj instanceof Float) {
            Float f = (Float)obj;
        }
    }
}