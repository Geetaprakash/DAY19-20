
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC5 {
    public static void main(String[] args) {
        String Expected = ("^[a-zA-Z0-9]*@[a-c 1-8]+");
        String PassWord = "geetaSBB09@abc18";
        Pattern pt = Pattern.compile("^[a-zA-Z0-9]*@[a-c 1-8]+");
        Matcher mt = pt.matcher(PassWord);
        boolean result = mt.matches();
        System.out.println(result);
    }
}