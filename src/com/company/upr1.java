package com.company;

import java.util.Scanner;


public class upr1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0 || i % 5 == 0) {
                sum = sum + i;
                System.out.println(i);

            }
        }
    }
}