import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UC6 {
    public static void main(String[] args) {
        String Expected = ("[A-Z]+");
        String PassWord = "GEETASBB";
        Pattern pt = Pattern.compile("[A-Z]+");
        Matcher mt = pt.matcher(PassWord);
        boolean result = mt.matches();
        System.out.println(result);
    }
}