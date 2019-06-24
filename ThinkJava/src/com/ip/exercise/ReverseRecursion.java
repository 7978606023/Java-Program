package com.ip.exercise;

public class ReverseRecursion {
public static String revRecursion(String str) {
    if(str.isEmpty()){
        return str;
     } else {
        return revRecursion(str.substring(1))+str.charAt(0);
     }
  }
  
 } 


