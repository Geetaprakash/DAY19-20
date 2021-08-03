package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UC3 {
    public static void main(String[] args) {
         String Expected =("[a-zA-Z0-9]*@[a-zA-Z]+([.][a-zA-Z]+)+");
         String text= "GEETshivargmail12@gmail.com";
         Pattern pt=Pattern.compile(Expected);
         Matcher mt= pt.matcher(text);
         boolean result=mt.matches();
         System.out.println(result);
            }
    }

