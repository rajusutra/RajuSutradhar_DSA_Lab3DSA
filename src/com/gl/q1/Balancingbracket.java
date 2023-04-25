package com.gl.q1;

import java.util.*;   

public class Balancingbracket {   
   
  @SuppressWarnings("unchecked")
public static boolean balancedbracket(String inputStr) {   
       
     
     @SuppressWarnings("rawtypes")
	Stack stack = new Stack();   
     char[] charArray = inputStr.toCharArray();   
       
     
     for (int i = 0; i < charArray.length; i++) {   
           
        
         char current = charArray[i];   
           
        
         if (current == '{' || current == '[' || current == '(') {   
              
             stack.push(current);   
             continue;   
         }   
          
         if (stack.isEmpty()) {    
             return false;   
         }   
           
          
         char popChar;   
         switch (current) {   
             case ')':   
             popChar = (char) stack.pop();   
             if (popChar == '{' || popChar == '[')   
                 return false;   
             break;   
             case '}':   
             popChar = (char) stack.pop();   
             if (popChar == '(' || popChar == '[')   
                 return false;   
             break;   
             case ']':   
             popChar = (char) stack.pop();   
             if (popChar == '(' || popChar == '{')   
                 return false;   
             break;   
         }   
     }   
     return (stack.isEmpty());   
 }   
 
 public static void main(String[] args) {   
       
     String inputStr;   
       
     inputStr = "{({})}";   
       
     if (balancedbracket(inputStr))   
         System.out.println("Input string "+inputStr+" is balanced.");   
     else   
         System.out.println("Input string "+inputStr+" is not balanced.");   
 }   
}
