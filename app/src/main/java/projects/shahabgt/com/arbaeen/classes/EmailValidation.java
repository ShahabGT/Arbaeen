package com.example.jonathan.arbaeen.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {


    public static boolean isValid(String email)
    {
        Pattern pattern;
        boolean res;
        Matcher matcher;
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        if(matcher.matches()){
            email=email.toLowerCase();
            if(email.contains("@yahoo.")||email.contains("@gmail.")||email.contains("@aol.")||email.contains("@hotmail.")||email.contains("@ymail.")||email.contains("@live.")){
                res= true;
            }else {
                res= false;
            }
        }else {res=false;}
        return  res;
    }
}
