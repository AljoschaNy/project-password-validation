package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
 @Test
 void hasPasswordMinLength_whenEmptyString_returnFalse() {
     boolean actual = Main.hasPasswordMinLength(0);
     //THEN
     assertFalse(actual);
 }

 @Test
 void hasPasswordMinLength_whenPasswordLengthIs4_thenReturnFalse() {
     boolean actual = Main.hasPasswordMinLength(4);
     assertFalse(actual);
 }

 @Test
 void hasPasswordMinLength_whenPasswordLengthIs8_thenReturnTrue() {
     boolean actual = Main.hasPasswordMinLength(8);
     assertTrue(actual);
 }

 @Test
 void hasPasswordDigits_whenPasswordIs_hallihallo_thenReturnFalse() {
     boolean actual = Main.hasPasswordDigits("hallihallo");
     assertFalse(actual);
 }

 @Test
 void hasPasswordDigits_whenPasswordIs_hallihallo1_thenReturnTrue() {
     boolean actual = Main.hasPasswordDigits("hallihallo1");
     assertTrue(actual);
 }

@Test
void hasPasswordDigits_whenPasswordIs_hall123ihallo1_thenReturnTrue() {
    boolean actual = Main.hasPasswordDigits("hall123ihallo1");
    assertTrue(actual);
}
}