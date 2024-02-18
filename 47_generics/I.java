import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Golu");
        list.add(true);
        list.add(24.35f);

        pro(list);
    }

    static void pro(ArrayList<Integer> list) {
        System.out.println(list);
    }
}