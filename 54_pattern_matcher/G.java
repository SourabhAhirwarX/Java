import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("sohan");
        Matcher m = p.matcher("sohan is a good boy and sohan is my best friend and sohan likes to play cricket");

        while(m.find()) {
            System.out.println(m.group()+" Start Index:"+m.start()+" End Index:"+m.end());
        }
    }
}