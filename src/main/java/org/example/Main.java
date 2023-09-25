package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

    }

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

    public static boolean hasPaswordLowerAndUpperLetters(String password) {
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
        return false;
    }
}