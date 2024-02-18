import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d\\d");
        Matcher m = p.matcher("mohan scored 80 out of 100 and he is 7" );

        while(m.find()) {
            System.out.println(m.group()+" Start Index:"+m.start()+" End Index:"+m.end());
        }
    }
}