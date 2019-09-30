/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author jarry
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String t = new String("jacob");
   
        System.out.printf("The string %s is a palindrome : %s",t,checkIfPalindrome(t));
    }
public static boolean checkIfPalindrome(String t){
       String reverse = new StringBuilder(t).reverse().toString();
       
       if(t.equals(reverse))
       
       return true;
       
       return false;
    
}    
}

