package com.engeto;

import java.util.ArrayList;
import java.util.List;

public class Hlavna6 {
    public static void main(String[] args) {
        //porovnaniRetezcu();
        list();
        //set();
        //collections();
        //compare();
        //map();
    }
//    List
//    Vytvoř seznam, do kterého budeš ukládat textové řetězce — jména kamarádů.
//    Přidej do seznamu pět jmen: Vít, Jana, Karel, Edita, Jana.
//    Vypiš všechny prvky seznamu.
//    Vypiš počet prvků seznamu.
//    Vypiš 3. prvek v seznamu.
//            Odstraň 2. prvek ze seznamu.
//    Odstraň jméno "Jana" ze seznamu.
//    Vypiš, zda list obsahuje jméno "Ivan".
//    Vypiš, zda list obsahuje jméno "Vít".
//    Vypiš počet prvků v listu (samozřejmě se od minulého výpisu změnil).
//    Vypiš znovu 3. prvek v seznamu (všimni si, že nyní to nebude Karel, ale Edita).
    private static void list(){
        List<String> friends = new ArrayList<>();
        friends.add("Vit");

    }
}










//    private static void map() {
//        Map<Integer, String> mapOfFriends = new TreeMap<>();
//        mapOfFriends.put(-45, "Vít");
//        mapOfFriends.put(3, "Karel");
//        mapOfFriends.put(1989, "Václav");
//        mapOfFriends.put(2, "Jana");
//        System.out.println(mapOfFriends);
//        mapOfFriends.forEach((k,v) -> System.out.print(k + "=> "+v+" ") );
//        System.out.println(mapOfFriends.get(1989));
//        System.out.println(
//                mapOfFriends.getOrDefault(1988, "Neexistuje!"));
//    }
//
//    private static void compare() {
//        Customer karel1 =
//                new Customer(
//                        1, "Karel",
//                        LocalDate.of(2000, 12, 13));
//        Set<Customer> customers = new HashSet<>();
//        customers.add(karel1);
//        customers.add(karel1);
//        Customer karel2 =
//                new Customer(
//                        1, "Karel",
//                        LocalDate.of(2000, 12, 13));
//        customers.add(karel2);
//        customers.forEach(c -> System.out.print(c+", "));
//        System.out.println("----");
//        List<Customer> listOfCustomers = new ArrayList<>();
//        Customer roman = new Customer(
//                2, "Roman", LocalDate.now());
//
//        Collections.addAll(listOfCustomers, karel2, roman,karel1);
//        listOfCustomers.forEach(c -> System.out.print(c+", "));
//        System.out.println();
//
//        Collections.sort(listOfCustomers);
//        // Vypiš po seřazení:
//        listOfCustomers.forEach(c -> System.out.print(c+", "));
//        System.out.println();
//
//        // Chci seznam seřadit podle data narození:
//        Collections.sort(listOfCustomers,
//                new Comparator<Customer>() {
//                    @Override
//                    public int compare(Customer o1, Customer o2) {
//                        return
//                                o1.getDateOfBirth()
//                                        .compareTo(o2.getDateOfBirth());
//                    }
//                }.reversed());
//        // Vypiš po seřazení:
//        listOfCustomers.forEach(c -> System.out.print(c+", "));
//        System.out.println();
//    }
//
//    private static void collections() {
//        List<String> list = List.of("Karel", "Adam", "Yveta");
//        // Nelze měnit obsah: list.add("Karel");
//        list.forEach(System.out::println);
//        System.out.println("První v abecedě: "+Collections.min(list));
//
//
//        List<Integer> ints1 = new LinkedList<>();
//        Collections.addAll(ints1, 151, 84, 36);
//        Collections.max(ints1);
//        List<Integer> ints2 = ints1;
//        // Je tu jen jedna kolekce => v obou proměnných
//        // Rozdíl: vytvoří se kopie kolekce:
//        // List<Integer> ints2 = new ArrayList<>(ints1);
//
//        // Odstraní 85. prvek: ints2.remove(84);
//        ints2.remove(Integer.valueOf(84));
//        ints1.forEach(System.out::println);
//        System.out.println("---");
//        Collections.sort(ints1);
//        ints1.forEach(System.out::println);
//    }
//
//    private static void list() {
//        List<String> listOfFriends = new ArrayList<>();
//        listOfFriends.add("Vít");
//        Collections.addAll(listOfFriends, "Jana", "Karel", "Edita", "Jana");
//        String next = "Eduard";
//        listOfFriends.add(next);
//        listOfFriends.add(next);
//        // Výpis všech prvků:
//        for (String friend : listOfFriends) {
//            System.out.println(friend);
//        }
//        System.out.println("Třetí prvek: "+listOfFriends.get(2));
//        // třetí prvek - indexy jsou od nuly!!!
//        listOfFriends.remove(2); // Odstraním Karla
//        System.out.println("Třetí prvek po odstranění: "+listOfFriends.get(2)); // Teď už bude třetí Edita
//        listOfFriends.remove("Jana"); // Odstraním PRVNÍ Janu
//        System.out.println("---");
//        listOfFriends.forEach(System.out::println);
//        System.out.println("---");
//        System.out.println("Počet prvků: "+listOfFriends.size());
//        listOfFriends.forEach(friend -> System.out.print(friend+" "));
//        System.out.println("\n---");
//    }
//
//    private static void set() {
//        Set<String> setOfFriends = new HashSet<>();
//        // Nebo TreeSet<>() a pak bude množina vždy seřazená (ale chvilku to trvá)
//        setOfFriends.add("Vít");
//        Collections.addAll(setOfFriends, "Jana", "Karel", "Edita", "Jana");
//        String next = "Eduard";
//        setOfFriends.add(next);
//        setOfFriends.add(next);
//        System.out.println("Výpis všech prvků: ");
//        for (String friend : setOfFriends) {
//            System.out.println(friend);
//        }
//        System.out.println("---");
//        // Nelze: System.out.println("Třetí prvek: "+setOfFriends.get(2));
//        setOfFriends.remove(2); // Odstraním "2"
//        System.out.println("---");
//        setOfFriends.forEach(friend -> System.out.print(friend+" "));
////        setOfFriends.forEach(System.out::println);
//        System.out.println("\n---");
//        setOfFriends.remove("Karel"); // Odstraním Karla
//        System.out.println("---");
//        setOfFriends.forEach(friend -> System.out.print(friend+" "));
////        setOfFriends.forEach(System.out::println);
//        System.out.println("\n---");
////        System.out.println("Třetí prvek po odstranění: "+setOfFriends.get(2)); // Teď už bude třetí Edita
////        setOfFriends.remove("Jana"); // Odstraním PRVNÍ Janu
////        System.out.println("---");
//        System.out.println("Počet prvků: "+setOfFriends.size());
//        String name = "Edita";
//        System.out.print(name);
//        if (setOfFriends.contains(name)) {
//            System.out.println(" tam je!");
//        } else {
//            System.out.println(" tam není!");
//        }
//    }
//
//    private static void porovnaniRetezcu() {
//        String first = "Ahoj";
//        String second = "Aho";
//        second += "j";
//        System.out.print(first + " a "+ second + " ");
//        if (first.equals(second)) { // Pozor! Nefunguje: first == second
//            System.out.println("jsou stejné!");
//        } else {
//            System.out.println("se liší!");
//        }
//    }
