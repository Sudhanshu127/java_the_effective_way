package com.example.detect;

public class GoogleAPI extends API_CLass{

    private static GoogleAPI single_instance = null;
    private String credentials;
    @Override
    public String detect(String text) {
        return "Welcome to Google";
    }

    @Override
    public String apiName() {
        return "Google";
    }

    private GoogleAPI() {
        credentials = "google";
    }

    public static GoogleAPI getInstance(){
        if(single_instance == null){
            single_instance = new GoogleAPI();
        }
        return single_instance;
    }
}
