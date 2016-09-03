package com.selimssevgi.utils;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by ssselim on 9/3/16.
 */
public class StringsTest {

  @Test
  public void testIsPalindrome1() {
    assertTrue(Strings.isPalindrome1("asa"));
    assertFalse(Strings.isPalindrome1("asdaf"));
  }

  @Test
  public void testReplaceTrLetters(){
    String turkishLetters = "ç,ı,ş,ğ,ü,ö";
    assertEquals("c,i,s,g,u,o", Strings.replaceTrLetters(turkishLetters));

    String turkishWord = "Çalışmak";
    assertEquals("calismak", Strings.replaceTrLetters(turkishWord));

  }
}
