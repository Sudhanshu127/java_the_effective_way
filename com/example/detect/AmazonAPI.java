package com.example.detect;

public class AmazonAPI extends API_CLass {
    private static AmazonAPI single_instance = null;
    private static String credentials;
    private AmazonAPI(){
        credentials = "amazon";
    }
    public static AmazonAPI getInstance(){
        if(single_instance == null)
            single_instance = new AmazonAPI();
        return single_instance;
    }

    @Override
    public String detect(String text) {
        return "Welcome to Amazon";
    }

    @Override
    public String apiName() {
        return "Amazon";
    }
}