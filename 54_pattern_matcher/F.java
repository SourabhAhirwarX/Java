import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("mohan");
        Matcher m = p.matcher("sohan is a good boy and sohan is my best friend and sohan likes to play cricket");

        System.out.println(m.find());

        System.out.println(m.group());
        System.out.println(" Start Index:"+m.start());
        System.out.println(" End Index:"+m.end());
    }
}

// Exception in thread "main" java.lang.IllegalStateException: No match found