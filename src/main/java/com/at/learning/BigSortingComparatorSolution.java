package com.at.learning;

/*

Consider an array of numeric strings, , where each string is a positive number with anywhere from to digits. Sort the array's elements in non-decreasing (i.e., ascending) order of their real-world integer values and print each element of the sorted array on a new line.

Input Format

The first line contains an integer, , denoting the number of strings in .
Each of the subsequent lines contains a string of integers describing an element of the array.

Constraints

    Each string is guaranteed to represent a positive integer without leading zeros.
    The total number of digits across all strings in is between and (inclusive).

Output Format

Print each element of the sorted array on a new line.

Sample Input 0

6
31415926535897932384626433832795
1
3
10
3
5

Sample Output 0

1
3
3
5
10
31415926535897932384626433832795

Explanation 0

The initial array of strings is . When we order each string by the real-world integer value it represents, we get:

    1 <= 3 <= 3 <= 5 <= 10 <= 31415926535897932384626433832795

We then print each value on a new line, from smallest to largest.
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSortingComparatorSolution {
    static String[] bigSorting(String[] arr) {
        // Complete this function
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String str1, String str2) {
                if (str1.length() < str2.length()) {
                    return -1;
                } else if (str1.toString().length() > str2.toString().length()) {
                    return 1;
                } else if (str1.toString().length() == str2.toString().length()) {
                    if (str1.compareTo(str2) < 0) {
                        return -1;
                    } else if (str1.compareTo(str2) > 0){
                        return 1;
                    } else {
                        return 0;
                    }
                }
                return 0;
            }

        });
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        String[] result = bigSorting(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }

}
