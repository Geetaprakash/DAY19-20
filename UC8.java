import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC8 {
    public static void main(String[] args){
    String Expected = ("^[A-Z a-z &$]+");
    String PassWord = "GEETAsb&$";
    Pattern pt = Pattern.compile("^[A-Z a-z &$]+");
    Matcher mt = pt.matcher(PassWord);
    boolean result = mt.matches();
        System.out.println(result);
}
}
