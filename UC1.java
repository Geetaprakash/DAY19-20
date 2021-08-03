package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UC1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[A-Z]{3}");
                Matcher firstName = p.matcher("GEETA");
                while (firstName.find()) {
                    System.out.println("valid");
               }
    }
}