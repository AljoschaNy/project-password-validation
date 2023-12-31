package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

    }

    //static String[] usedPasswords = {"Password1", "Aa345678", "HalliHallo_Halloele1"};

    public static boolean hasPasswordMinLength(int passwordLength) {
        if(passwordLength < 8) {
            return false;
        }
        return true;
    }

    public static boolean hasPasswordDigits(String password) {
        char[] charsInPasswordArr = password.toCharArray();
        for(char passwordChar: charsInPasswordArr) {
            if(Character.isDigit(passwordChar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasPasswordLowerAndUpperLetters(String password) {
        char[] charsInPasswordArr = password.toCharArray();
        boolean hasLowerChar = false;
        boolean hasUpperChar = false;

        for(char passwordChar: charsInPasswordArr) {
            if(Character.isLowerCase(passwordChar)) {
                hasLowerChar = true;
            } else if(Character.isUpperCase(passwordChar)) {
                hasUpperChar = true;
            }
        }

        if(hasLowerChar && hasUpperChar) {
            return true;
        }
        return false;
    }

    public static boolean hasPasswordNotBeenUsedBefore(String[] usedPasswordsArray, String newPassword) {
        for(int i = 0; i < usedPasswordsArray.length; i++) {
            if(usedPasswordsArray[i].equals(newPassword)) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasPasswordSpecialChars(String password) {
        Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher hasSpecial = special.matcher(password);
        if(hasSpecial.find()) {
            return true;
        }
        return false;
    }

}