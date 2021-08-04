package com.company;

import java.util.Scanner;

//Kadane's Algorithm
public class MaxSubArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i =0; i <arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int max =arr[0];
        int sum =0;

        for (int i =0; i <arr.length; i++){
            sum +=arr[i];
            if (sum > max) max =sum;
            if (sum < 0) sum =0;
        }
        System.out.println(max);
    }
}
