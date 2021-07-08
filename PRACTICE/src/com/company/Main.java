package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
            Scanner scn = new Scanner(System.in);
            char ch = scn.next().charAt(0);

            if (ch >= 'A' && ch <= 'Z') {
                System.out.println(" is an UpperCase character");
            } else if (ch >= 'a' && ch <= 'z') {
                System.out.println("is an LowerCase character");
            } else {
                System.out.println("INVALID INPUT");
            }
        }
    }
