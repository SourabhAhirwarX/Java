import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[[a-m]&&[j-s]]");
        Matcher m = p.matcher("jal kumar" );

        while(m.find()) {
            System.out.println(m.group()+" Start Index:"+m.start()+" End Index:"+m.end());
        }
    }
}