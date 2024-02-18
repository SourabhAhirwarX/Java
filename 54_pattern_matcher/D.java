import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("mohan");
        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan likes to play cricket");

        System.out.println(m.find());
        System.out.println(m.group()+"Start Index: "+m.start()+" End Index: "+m.end());
        System.out.println(m.find());
        System.out.println(m.group()+"Start Index: "+m.start()+" End Index: "+m.end());
        System.out.println(m.find());
        System.out.println(m.group()+"Start Index: "+m.start()+" End Index: "+m.end());
        
    }
}