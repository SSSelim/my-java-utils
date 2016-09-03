package com.selimssevgi.utils;

/**
 * Created by ssselim on 9/3/16.
 */
public class Strings {

  private Strings() {}

  //TODO: rewrite it to check not a word but sentece.
  public static boolean isPalindrome1(String word){
    char[] charArr = word.toLowerCase().toCharArray();
    int length = charArr.length;

    for(int i=0, j=length-1; i<=j; i++, j-- ){
      if( charArr[i] != charArr[j] ){
        return false;
      }
    }

    return true;
  }

  public static String reverse(String word){
    char[] charArr = word.toCharArray();
    int length = charArr.length;
    char[] reverseArr = new char[length];
    int i = length - 1;

    for( char c : charArr ){
      reverseArr[i] = c;
      i--;
    }

    return new String(reverseArr);
  }
}
