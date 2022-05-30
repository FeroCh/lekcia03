package com.engeto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loops {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(5); ints.add(8); ints.add(3);

        ints = Arrays.asList(5, 8, 3);

        System.out.println(ints);
        // foreach:
        for (Integer i : ints) {
            System.out.println("Další číslo: "+i);
        }

        // for:
        for (int i = 0; i < ints.size(); i++) {
            System.out.println(
                    "Další číslo: "+ints.get(i));
        }

        // while:
        int i = 0;
        while (i < ints.size()) {
            System.out.println(
                    "Další číslo: "+ints.get(i));
            i++;
        }

        LocalDate date = LocalDate.now();
        System.out.println(date.minusWeeks(4));

        System.out.println(15 % 4);
    }
}

