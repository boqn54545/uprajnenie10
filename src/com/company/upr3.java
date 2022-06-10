package com.company;

import java.util.Objects;
import java.util.Scanner;

public class upr3 {
    public static Object check() {
        Scanner scan = new Scanner(System.in);
        String a = "a";
        String b = scan.nextLine();
        if (!Objects.equals(b, a)) {
            check();
            do {
                System.out.println("Enter something");
            } while (Objects.equals(b, a));

        }

        return null;
    }

    public static void main(String[] args) {
        check();
    }
}
