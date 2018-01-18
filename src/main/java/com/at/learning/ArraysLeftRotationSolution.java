package com.at.learning;

import java.util.Scanner;

public class ArraysLeftRotationSolution {

    private static void rotateArray(int[] inputArray, int numRotation) {
           for (int i = 0; i < numRotation; i++) {
               inputArray[i] = inputArray[inputArray.length - numRotation];
           }

           for (int j = 0; j < inputArray.length; j++) {
               System.out.print(inputArray[j] + " ");
           }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        rotateArray(a, k);

    }
}
