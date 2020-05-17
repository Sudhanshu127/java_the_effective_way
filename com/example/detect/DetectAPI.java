package com.example.detect;

import java.util.HashMap;
import java.util.Map;

public class DetectAPI {
    private static Map<String, Object> map = new HashMap<String, Object>();

    public static void main(String[] args) {
        map.put(GoogleAPI.getInstance().apiName(),GoogleAPI.getInstance());
        map.put(AmazonAPI.getInstance().apiName(),AmazonAPI.getInstance());
        test("Google","Hello");
        test("Amazon","Hello");
    }
    public static void test(String api, String text) {
//        System.out.println("I am in DetectAPI");
        API_CLass myObject = (API_CLass) map.get(api);
        if(myObject != null)
        {
            System.out.println(myObject.detect(text));
        }
        else
        {
            System.out.println("API NOT FOUND");
        }
    }
}
