import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]{3}");
        Matcher m = p.matcher("ram is a good singer" );

        while(m.find()) {
            System.out.println(m.group()+" Start Index:"+m.start()+" End Index:"+m.end());
        }
    }
}