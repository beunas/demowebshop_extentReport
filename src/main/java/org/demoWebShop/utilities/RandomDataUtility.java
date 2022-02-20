package org.demoWebShop.utilities;

import java.util.Random;

public class RandomDataUtility {
    public String getRandomString(String valueType) {
        String randomValue = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 5;
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        if(valueType.equals("email")){
            randomValue = sb.toString() + "@gmail.com";
        }
        else if(valueType.equals("uname")){
            randomValue = sb.toString() ;
        }
        return randomValue;
    }
}
