package com.mihaibotnariuc.maib.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {
    private static Random objectOfRandomClass = new Random();
    public static int getRandomInt(int min, int max){
        int delta = max - min;

        if (delta<=0){
            System.out.println("the delta has to be positive");
            return 0;
        }
        int randomIntForThisDelta = objectOfRandomClass.nextInt(delta);
        return (randomIntForThisDelta + min);
       }
       public static int getRandomInt (int limit){
        if (limit<0){
            return 0;
        }
        return objectOfRandomClass.nextInt(limit);
    }
    static String getRandomEmail(String domainName){
        String uniqueUUID = UUID.randomUUID().toString();
        return uniqueUUID + "@" + domainName;
    }
//    public static String generateValidRandomString (int length){
//        String acceptedChars ="asjdlaAJSDLAKSDLLKJHJASFNASBDNASB12312412";
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0, i< length; i++){

        }

