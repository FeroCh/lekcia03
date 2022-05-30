package com.engeto;

public class Cviceni {
    public static void main(String[] args) {
        int previous = 0; // Předchozí číslo
        int current = 1;  // Aktuální číslo
        System.out.print("0 1 ");
        int next = 1; // Následující číslo
        do {
            System.out.print(next + " ");
            previous = current;
            current = next;
            next = previous + current;
        } while (next <= 1000);

        System.out.println("\n-------");

        // Test, jestli je číslo dělitelné:
        int a = 15;
        int b = 5;
        // Je a dělitelné číslem b?
        if (a % b == 0) {
            System.out.println(a + " je dělitelné "+b);
        }
    }
}