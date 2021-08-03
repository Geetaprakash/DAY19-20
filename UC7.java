import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UC7 {
    public static void main(String[] args){
        String Expected = ("[A-Z 1-2]+");
        String PassWord = "GEETASBB12";
        Pattern pt = Pattern.compile("[A-Z 1-2]+");
        Matcher mt = pt.matcher(PassWord);
        boolean result = mt.matches();
        System.out.println(result);
    }
    }

