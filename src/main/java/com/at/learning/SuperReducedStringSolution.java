package com.at.learning;

/*
Steve has a string, , consisting of lowercase English alphabetic letters. In one operation, he can delete any pair of adjacent letters with same value. For example, string "aabcc" would become either "aab" or "bcc" after operation.

Steve wants to reduce as much as possible. To do this, he will repeat the above operation as many times as it can be performed. Help Steve out by finding and printing 's non-reducible form!

Note: If the final string is empty, print Empty String .

Input Format

A single string, s.

Constraints
 1 <= n <= 100

Output Format

If the final string is empty, print Empty String; otherwise, print the final non-reducible string.

Sample Input 0

aaabccddd

Sample Output 0

abd

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuperReducedStringSolution {

    static String super_reduced_string(String s){
        // Complete this function
        String result = "";
        char[] charOfString = s.toCharArray();
        char ignoreChar = 0;
        List<Character> charList = new ArrayList<>();
        for(int i = 0; i < charOfString.length; i++) {
            if (i != 0 && charOfString[i] == charOfString[i-1]) {
                ignoreChar = charOfString[i];
            } else if (i != 0 && charOfString[i] != charOfString[i-1]) {
                if (charOfString[i-1] != ignoreChar) {
                    charList.add(charOfString[i-1]);
                }
                if ( i == (charOfString.length -1)) {
                    charList.add(charOfString[i]); //Add last character if it is not repeated.
                }
                ignoreChar = 0; //reset ignore char

            }
        }
        for (int j = 0; j < charList.size(); j++) {
            result = result.concat(Character.toString(charList.get(j)));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);

    }
}
