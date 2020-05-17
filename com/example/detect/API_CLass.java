package com.example.detect;

public abstract class API_CLass implements LanguageDetect{
    public static String validate(String text){
        if(text != null)
        {
            return "Valid";
        }
        else
        {
            return "Invalid";
        }
    }

}
