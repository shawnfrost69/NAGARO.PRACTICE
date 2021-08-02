package com.company;

import java.util.Scanner;

public class Arrange012 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int lo = 0;
        int mid = 0;
        int hi = arr.length - 1;

        while (mid <= hi) {
            int temp;
            switch (arr[mid]) {
                case 0: {
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;

                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[hi];
                    arr[hi] = temp;
                    hi--;
                    break;
                }

            }
        }
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
            }
        }


