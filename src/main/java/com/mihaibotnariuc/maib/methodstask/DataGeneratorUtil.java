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

static String getRandomEmail(int maxlength, String domainName) {
    String acceptedChars = "ABCDEF123124asdasd";
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < maxlength; i++) {
        int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
        stringBuilder.append(acceptedChars.charAt(randomIndex));

        System.out.println("As part of iteration [" + i + "] the letter " +
                "[" +acceptedChars.charAt(randomIndex) + "] was added");
    }
return stringBuilder.toString() + "@" + domainName;


}
        }

