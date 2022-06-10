package com.company;

import java.util.Scanner;

public class upr2 {

    public static void ASCII() {
        char i;
        for (i = 33; i <= 128; i++) {

            System.out.println((int) i + " " + i);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ASCII();
    }
}
