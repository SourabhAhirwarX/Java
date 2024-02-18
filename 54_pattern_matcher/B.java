import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("mohan");
        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan likes to play cricket");

        System.out.println(p);
        System.out.println(p.pattern());
        System.out.println(m);
        System.out.println(m.pattern());
    }
}