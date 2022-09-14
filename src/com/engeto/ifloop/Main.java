package com.engeto.ifloop;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //region Demo
    /**
     * Ukázka použítí metody {@link Support#safeReadInt()}
     *
     * Tato metoda použije metodu {@link Support#safeReadInt() k načtení
     * jednoho čísla od uživatele a vypsání tohoto čísla na výstup.
     *
     * Podobně můžeš používat metodu {@link Support#safeReadInt()}
     * i v dalších metodách.
     */
    public static void readOneIntFromInputAndPrintIt() {
        int input = Support.safeReadInt();
        System.out.println("You entered: "+input);
    }
    //endregion

    //region Úlohy na cykly
    /**/
     /* Čte čísla, která zadává uživatel a vypisuje je na výstup.
     * Metoda pokračuje ve čtení opakovaně tak dlouho, dokud uživatel zadává kladná čísla či nulu.
     *
     * Jakmile uživatel zadá záporné číslo, metoda skončí.
     */
    public static void readIntsFromInputAndPrintItUntilNegative() {
        int input; // musi byt viditelny v podmienke while preto ho davam pred cyklus do
        do {
            input = Support.safeReadInt();
            System.out.println("You entered: "+input);
        } while (input >=0);
    }

    /**
     * Čte čísla ze vstupu tak dlouho, dokud uživatel nezadá záporné číslo.
     * Jako návratovou hodnotu vrátí součet zadaných čísel (záporné číslo by nemělo být zahrnuto).
     *
     * @return Součet všech zadaných čísel (záporné číslo ukončující vstup není zahrnuto).
     */
    public static int sumAllInputUntilNegative() {
        int input; // musi byt viditelny v podmienke while preto ho davam pred cyklus do
        int sum = 0;
        do {
            input = Support.safeReadInt();
            if(input >=0){
                sum += input;
            }
        } while (input >=0);
        return sum;
    }

    /**
     * Čte čísla ze vstupu tak dlouho, dokud uživatel nezadá záporné číslo.
     * Všechna načtená čísla uloží do listu, který vrátí jako návratovou hodnotu.
     *
     * @return List načtených hodnot (záporná hodnota není zahrnuta v listu)
     */
    public static List<Integer> storeAllInputInArrayListUntilNegative() {
        List<Integer> list = new ArrayList<>();
        int input; // musi byt viditelny v podmienke while preto ho davam pred cyklus do
//        int sum = 0;
        do {
            input = Support.safeReadInt();
            if(input >=0){
               list.add(input);
            }
        } while (input >=0);
        return list;
    }

    /**
     * Dostane jako parametr list čísel. Vypíše čísla na obrazovku. Každé číslo vypiš na samostatný řádek.
     * @param list List čísel, která se mají vypsat.
     */
    public static void printAllIntegersFromList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(""+i+": "+list.get(i));
        }
    }

    /**
     * Sečte hodnoty z listu a vrátí výsledek jako návratovou hodnotu.
     * @param list List čísel, která chceme sečíst.
     * @return Součet všech čísel v listu.
     */
    public static Integer sumAllIntegersFromList(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
    //endregion

    //region Podmínky
    /**
     * Vypíše čísla ze seznamu, která jsou menší než zadaný limit.
     * @param list Seznam čísel, která máme zkontrolovat.
     * @param limit Limit - vypsána budou pouze čísla z listu, která jsou menší než limit
     */
    public static void printIntegersUnderLimit(List<Integer> list, int limit) {
        for (Integer integer : list) {
            if (integer < limit) {
                System.out.println(integer);
            }
        }
    }

    /**
     * Vypíše čísla ze zadaného listu.
     * Při výpisu ale nahradí:
     * - číslo 1 slovem "one",
     * - číslo 2 slovem "two",
     * - číslo 3 slovem "three"
     * Ostatní čísla vypíše jako číselnou hodnotu.
     * Například pokud dostane jako parametr seznam [5, 3, 1, 48, 2],
     * vypíše: 5, three, one, 48, two.
     * @param list Seznam čísel, která se mají vypsat.
     */
    public static void printIntegersWithReplace(List<Integer> list) {
//       for(int i= 0;i < list.size();i++){
//            if(list.get(i) == 1){
//                System.out.println("one ");
//            }
//            else if (list.get(i) == 2) {
//                System.out.println("two ");
//            }
//            else if (list.get(i) == 3){
//                System.out.println("three ");
//            }
//            else{
//                System.out.println(list.get(i)+" ");
//            }
//        }
        for (Integer i : list) {
            switch (i) {
                case 1 -> System.out.println("one ");
                case 2 -> System.out.println("two ");
                case 3 -> System.out.println("three ");
                default -> System.out.println((i) + " ");
            }
        }
    }
    //endregion

    public static void main(String[] args) {
        // Příklad:
        System.out.println("--- Example - read and print one integer ---");
        readOneIntFromInputAndPrintIt();
        // ---
        System.out.println("--- Task 1 - read and print integers until negative ---");
        readIntsFromInputAndPrintItUntilNegative();
        // ---
        System.out.println("--- Task 2 - sum all integers until negative ---");
        System.out.println("Total sum: " + sumAllInputUntilNegative());
        // ---
        System.out.println("--- Task 3 - read integers to list until negative ---");
        List<Integer> list = storeAllInputInArrayListUntilNegative();
        System.out.println(list);
        // ---
        System.out.println("--- Task 4 - print all integers from list ---");
        printAllIntegersFromList(list);
        // ---
        System.out.println("--- Task 5 - sum all integers in list ---");
        System.out.println("Total sum: " + sumAllIntegersFromList(list));
        // ---
        System.out.println("--- Task 6 - print integers under 5 from list ---");
        printIntegersUnderLimit(list, 5);
        // ---
        System.out.println("--- Task 7 - print integers - replace: 1 => \"one\", 2 => \"two\", 3 => \"three\" ---");
        printIntegersWithReplace(list);
    }
}

//        Domácí úkol — podmínky, cykly, switch
//        Zápis cyklů a podmínek si procvičíš na projektu, kde požádáme uživatele o zadávání čísel z klávesnice a takto zadaná čísla budeme zpracovávat.
//
//        Tvým úkolem je dopsat těla (kód) metod podle popisu v komentářích.
//
//        Protože čtení z klávesnice zatím neumíme, připravili jsme ti třídu Support s metodou Support.safeReadInt(), která načte z klávesnice jedno číslo a vrátí ho jako návratovou hodnotu. V úlohách můžeš tuto metodu využít.
//
//        Zadání
//        Využij šablonu projektu ve složce zadání
//        Buď si můžeš naklonovat celý repozitář a otevřít šablonu zadání podle návodu v lekci 4,
//        nebo si jednoduše:
//        vytvoř svůj projekt s balíčkem (package) com.engeto.ifloop
//        zkopíruj do něj obsah souborů:
//        Support.java
//        a Main.java
//        případně oprav název balíčku na prvním řádku tak, aby odpovídal tvému projektu.
//        Doplň těla všech metod podle popisu v komentářích.
//        Ve výsledku by každá metoda měla plnit to, co je popsáno v jejím komentáři.
//        Obtížnější části — „challenge“
//        V listu by nemělo být uloženo záporné číslo, kterým jsme ukončili vstup.


//autorovo riesenie
//package com.engeto.ifloop;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//
//    //region Demo
//    /**
//     * Example of use of {@link Support#safeReadInt()}
//     *
//     * Read one integer from input and print it to output
//     */
//    public static void readOneIntFromInputAndPrintIt() {
//        int input = Support.safeReadInt();
//        System.out.println("You entered: "+input);
//    }
//    //endregion
//
//    //region Loops
//    /**
//     * Read integers from input and print them until negative
//     * input.
//     */
//    public static void readIntsFromInputAndPrintItUntilNegative() {
//        int input;
//        do {
//            input = Support.safeReadInt();
//            System.out.println("You entered: " + input);
//        } while (input >= 0);
//    }
//
//    /**
//     * Sum all input numbers (negative number terminates reading) and return result.
//     * @return Sum of input numbers expect of terminating negative number.
//     */
//    public static int sumAllInputUntilNegative() {
//        int sum = 0, input = 0;
//        while (input >= 0) {
//            sum += input;
//            input = Support.safeReadInt();
//        }
//        return sum;
//    }
//
//    /**
//     * Store all input numbers in a list (negative number terminates reading).
//     * @return List of read values (terminating negative value is NOT included)
//     */
//    public static List<Integer> storeAllInputInArrayListUntilNegative() {
//        int input = 0;
//        List<Integer> result = new ArrayList<>();
//        while (input >= 0) {
//            input = Support.safeReadInt();
//            result.add(input);
//        }
//        result.remove(result.size()-1);
//        return result;
//    }
//
//    /**
//     * Print all integers from given list.
//     * @param list List of integers to print.
//     */
//    public static void printAllIntegersFromList(List<Integer> list) {
//        for (Integer i : list) {
//            System.out.println(i);
//        }
//    }
//
//    public static Integer sumAllIntegersFromList(List<Integer> list) {
//        Integer result = 0;
//        for (Integer i : list) {
//            result += i;
//        }
//        return result;
//    }
//
//    /**
//     * Print integers from given list that are smaller than given limit.
//     * @param limit Limit - only smaller integers are printed
//     * @param list List of integers to print.
//     */
//    public static void printIntegersUnderLimit(List<Integer> list, int limit) {
//        for (Integer i : list) {
//            if (i < limit) System.out.println(i);
//        }
//    }
//
//    /**
//     * Print integers from given list. Replace 1 by "one", 2 by "two", 3 by "three" - print others with no change.
//     * @param list List of integers to print.
//     */
//    public static void printIntegersWithReplace(List<Integer> list) {
//        for (Integer i : list) {
//            switch(i) {
//                case 1: System.out.println("one"); break;
//                case 2: System.out.println("two"); break;
//                case 3: System.out.println("three"); break;
//                default: System.out.println(i); break;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        // Example
//        System.out.println("--- Example - read and print one integer ---");
//        readOneIntFromInputAndPrintIt();
//        // ---
//        System.out.println("--- Task 1 - read and print integers until negative ---");
//        readIntsFromInputAndPrintItUntilNegative();
//        // ---
//        System.out.println("--- Task 2 - sum all integers until negative ---");
//        System.out.println("Total sum: " + sumAllInputUntilNegative());
//        // ---
//        System.out.println("--- Task 3 - read integers to list until negative ---");
//        List<Integer> list = storeAllInputInArrayListUntilNegative();
//        System.out.println(list);
//        // ---
//        System.out.println("--- Task 4 - print all integers from list ---");
//        printAllIntegersFromList(list);
//        // ---
//        System.out.println("--- Task 5 - sum all integers in list ---");
//        System.out.println("Total sum: " + sumAllIntegersFromList(list));
//        // ---
//        System.out.println("--- Task 6 - print integers under 5 from list ---");
//        printIntegersUnderLimit(list, 5);
//        // ---
//        System.out.println("--- Task 7 - print integers - replace: 1 => \"one\", 2 => \"two\", 3 => \"three\" ---");
//        printIntegersWithReplace(list);
//    }
//}