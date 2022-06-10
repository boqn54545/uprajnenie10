package com.company;

import java.util.Scanner;


public class Main {

    public static int sum2Numbers(int a, int b) {
        int s = a + b;

        return s;
    }

    public static void calculator(int a, int b) {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("e");
            a = scan.nextInt();
            b = scan.nextInt();
            if (b != 0) {
                System.out.println(sum2Numbers(a, b));
            }
            System.out.println("enter 2 num");

        } while (b != 0);
    }

    public static void printDiv11While() {
        int num = 11;
        while (num <= 2000000) {

            System.out.println(num + " ");
            num += 11;
        }
    }

    public static void printDiv11() {

        for (int i = 1; i <= 2000000; i++) {
            if (i % 11 == 0) {

                System.out.println(i + " ");

            }

        }

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        calculator(a, b);


    }
}
