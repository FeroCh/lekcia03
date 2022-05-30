package com.engeto.fizzbuzz;

public class Main {
    static final String FIZZ = "fizz";
    static final String BUZZ = "buzz";
    static final String FIZZBUZZ = "fizzbuzz";

    public static void fizzBuzzJava() {
        for (int i = 1; i <= 100; i++) {
            int remainder3 = i % 3;
            int remainder5 = i % 5;
            if ((remainder3 == 0) && (remainder5 == 0)) System.out.println(FIZZBUZZ);
            else if (remainder3 == 0)  System.out.println(FIZZ);
            else if (remainder5 == 0)  System.out.println(BUZZ);
            else System.out.println(i);
        }
    }

    public static void main(String[] args) {
        fizzBuzzJava();
    }
}

//        Cvičení: FizzBuzz
//        Jedna ze základních motivací při vývoji softwaru je minimalizace manuální práce a
//        snaha vyhnout se copy&paste. Zkuste si vyřešit úkol FizzBuzz, který se občas používá
//        při přijímacím řízení.
//
//        Zadání Fizz Buzz
//        Počítejte od 1 do 100 a při každém kroku vypište číslo daného kroku. Ale v případě,
//        že je číslo dělitelné třemi, tak napište místo čísla Fizz. Pokud je dělitelné pěti,
//        ak místo čísla vypište Buzz. A pokud je dělitelní třemi a pěti zároveň, tak FizzBuzz.
//
//        Ukázka výstupu
//        1
//        2
//        Fizz
//        4
//        Buzz
//        Fizz
//        7
//        8
//        Fizz
//        Buzz
//        11
//        Fizz
//        13
//        14
//        FizzBuzz
//        16
//        ...


