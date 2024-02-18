import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("0[Xx][a-f0-9]");

        Matcher m = p.matcher("0x2a34fez8 0X# 0X2xe");

        while(m.find()) {
            System.out.println(m.group() + " Start index: " + m.start() + " End Index: " + m.end());
        }
    }
}