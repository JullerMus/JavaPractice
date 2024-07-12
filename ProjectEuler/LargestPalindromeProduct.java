import java.util.*;

/**
 * https://projecteuler.net/problem=4
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
 * 9009 = 91 x 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class LargestPalindromeProduct {
    ArrayList<Integer> palindromeList = new ArrayList<>();

    /**
     * Reverses a string
     * @param s String to be reversed
     * @return The String reversed
     */
    public String reverseString(String s) {
        String reversedString = "";
        char ch;
        for(int i = 0; i <s.length(); i++){
            ch = s.charAt(i);
            reversedString = ch + reversedString;
        }
        return reversedString;
    }

    /**
     * Finds all palindromes made from the product of two 3-digit integers
     * Prints the largest palindrome, 580085.
     */
    public void fillPalindromeList() {
        int hit;
        String hitToString, hitToStringReverse;
        for(int i = 100; i <= 999; i++){
            for(int j = 100; j <= 999; j++){
                hit = i*j;
                hitToString = Integer.toString(hit);
                hitToStringReverse = reverseString(hitToString);
                if(hitToString.length() == 6 && hitToString.substring(0, 4).equals(hitToStringReverse.substring(0, 4))) {
                    palindromeList.add(hit);
                }
            }

        }
        System.out.println(palindromeList.getLast());
    }
}