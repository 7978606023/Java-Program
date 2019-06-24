package com.ip.imp;

import java.lang.*; 
import java.util.*; 
class Wave  
{
    static void fun(String s, int n)  
    { 
    if (n == 1)              
    {
        System.out.print(s);              
        return; 
    } 
  
    int len = s.length();  
     
    char [][]a = new char[len][len]; 
    char []c = s.toCharArray(); 
      
    int row = 0;          
    boolean down = true; 
      
    for (int i = 0; i < len; i++) 
    { 
        a[row][i] = c[i];  
       
        if (row == n - 1) 
            down = false;      
        else if (row == 0) 
            down = true;  
              
        if(down) 
            row++; 
        else
            row--; 
    } 
    for (int i = 0; i < n; i++) 
    {  
        for (int j = 0; j < len; j++) 
        { 
            System.out.print(a[i][j] + " "); 
        } 
        System.out.println(); 
    } 
    } 
    public static void main(String[] args) 
    { 
        String s = "hello world"; 
        int n = 3; 
        fun(s, n); 
    } 
}