package com.engeto;

public class Fibonacci {

    public static void untilLimit(long limit) {
        // V tomto kódu je ale jistý problém...
        // Projeví se při výpisu většího počtu prvků (třeba 100 prvků).
        if (limit <= 0) return;
        System.out.print("0 ");
        if (limit <= 1) return;
        System.out.print("1 1 ");
        Long previous = 1L, current = 1L, next = 2L;
        while (next <= limit) {
            System.out.print(next+" ");
            previous = current;
            current = next;
            next = previous + current;
        }
    }

    public static void firstN(int howManyNumbers) {
        // V tomto kódu je ale jistý problém...
        // Projeví se při výpisu většího počtu prvků (třeba 100 prvků).
        if (howManyNumbers <= 0) return;
        System.out.print("0 ");
        if (howManyNumbers <= 1) return;
        System.out.print("1 ");
        double previous = 0, current = 1, next;
        for (int i = 3; i <= howManyNumbers; i++) {
            next = previous + current;
            System.out.print(next+" ");
            previous = current;
            current = next;
        }
    }




    public static void main(String[] args) {
//        System.out.println("Fibonacci until 1000:");
//        untilLimit(1000);
//        System.out.println("\n=========\n");

        firstN(100);
    }
}

