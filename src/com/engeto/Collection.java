package com.engeto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {
    public static void main(String[] args) {

    //Vytvoř seznam (list) desetinných čísel a uložte do něj čísla: 10,0, 12,5 7,5 27,3
    List<Double> numbers1 = new ArrayList<>();
    numbers1.add(10.0);
    numbers1.add(12.5);
    numbers1.add(7.5);
    numbers1.add(27.3);
    // Lze také zkráceně:
    List<Double> numbers2 = Arrays.asList(10.0, 12.5, 7.5, 27.3);
    //Přidej do seznamu všechny násobky čísla 3 z rozsahu 20 až 50.
        for(Double i = 21.0; i <= 50.0; i += 3.0){
            numbers1.add(i);
        }
//    Přidej do seznamu dalších 10 náhodných čísel z rozsahu 100 až 200.
//    Pro generování náhodných čísel můžeš použít metodu Math.random(), která vrací číslo z rozsahu <0, 1). Její výsledek můžeš posléze vynásobit délkou rozsahu a přičíst základ.
//    Pro náhodná čísla z rozsahu 100 až 180 tedy například použij:
//    ZKOPÍROVAT KÓD
//    Double random = Math.floor(100+Math.random()*((180+1)-100));
//    Přidání náhodných čísel :
        Double random;
        for (int i = 0; i < 10; i++) {
            random = Math.floor(Math.random() * (201 - 100) + 100);
            System.out.println(random);
        }
//  Vypiš všechna čísla ze seznamu na obrazovku.
        System.out.println("Výpis čísel:");
            for (Double number : numbers1) {
            System.out.print(number + " ");
        }
        System.out.println(); // Odřádkování
        System.out.println("--------------");
    // Lze také pomocí Stream API:
            numbers1.forEach(d -> System.out.print(d+" "));
    // Nebo pro každé číslo na jednom řádku:
            numbers1.forEach(System.out::println);

//Sečtěte všechna čísla v seznamu.
        Double result = 0.0;
        for (Double number : numbers1) {
            result += number;
        }
        // Lze také pomocí Stream API:
        result = numbers1.stream().reduce(0.0, Double::sum);
        // ---
        System.out.println("Součet všech: "+result);

// Vypis cisel pres limit
        Double limit = 30.0;
        for (Double number : numbers1) {
            if (number > limit) System.out.println(number);
        }
        // Lze také pomocí Stream API:
        numbers1.stream().filter(number -> number > limit).forEach(System.out::println);

// Pro čísla z rozsahu 20-30 vypište: Warning(21) apod.
// V případě čísla 50 vypište: DANGER!. Ostatní čísla vypište normálně.
        final double MIN_WARNING = 20.0, MAX_WARNING = 30.0;
        for (Double number : numbers1) {
            String output;
            if (number >= MIN_WARNING && number <= MAX_WARNING) output = "Warning("+number+")";
            else if (number == 50) output = "DANGER!";
            else output = number.toString();
            System.out.println(output);
        }
        // Lze také pomocí Stream API:
        numbers1.forEach( number -> {
            String output;
            if (number >= MIN_WARNING && number <= MAX_WARNING) output = "Warning("+number+")";
            else if (number == 50) output = "DANGER!";
            else output = number.toString();
            System.out.println(output);
        });
//      Najděte největší číslo v seznamu.
        if (numbers1.size() > 0) {
            Double max = numbers1.get(0);
            for (int i = numbers1.size() - 1; i > 0; i--) {
                Double current = numbers1.get(i);
                if (current > max) max = current;
            }
            // Lze také pomocí Stream API:
            max = numbers1.stream().max(Double::compareTo).get();
            // ---
            System.out.println("Maximum: "+max);
        }



    }
}

/*






 */