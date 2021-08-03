import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UC4 {

            public static void main(String[] args) {
               String Expected =("^(0|91)?[8-9][0-9]{9}$");
                String PhNum= "08927762676";
                Pattern pt=Pattern.compile("^(0|91)?[8-9][0-9]{9}$");
                Matcher mt= pt.matcher(PhNum);
                boolean result=mt.matches();
                System.out.println(result);
            }
        }