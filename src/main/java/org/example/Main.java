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
        return false;
    }
}