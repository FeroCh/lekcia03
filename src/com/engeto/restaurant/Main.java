package com.engeto.restaurant;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;

public class Main {
}



//        Cvičení: restaurace
//        Zadání
//        Napiš program, který bude fungovat jako seznam objednávek (order) v restauraci.
//
//        Odkaz ke stažení šablony řešení (vyřešena tvorba tříd) najdete zde:
//        git@github.com:ENGETO-Java-Akademie-2021-07-12/ukoly-a-reseni.git
//
//        Vytvoření tříd pro uložení dat
//        První úkol je vytvoření tříd, které budou schopné uložit tato data.
//
//        O každé objednávce ukládáme: pořadí objednávky (id), číslo stolu (table number), datum objednávky, typ platby (hotově — cash, kartou — card) a dále výčet objednaných položek. Objednaná položka je popsána svým popisem (title), cenou a množstvím (quantity).
//
//        Ve třídě Settings by mělo být jako konstanta uloženo číslo, udávající počet stolů v restauraci. Pokud zadáme u objednávky jako číslo stolu vyšší číslo, pak třída vyhodí výjimku.
//
//        Třída pro práci s objednávkami
//        Připrav třídu, která bude zastřešovat práci se všemi objednávkami dohromady.
//
//        Tato třída by měla umět kromě přidávání objednávek i následující analytické metody:
//
//        Zjisti počet objednávek.
//        Připrav metodu pro výpočet celkové ceny objednávky.
//        Na základě názvu položky spočítej celkový počet kusů dané položky, které jsme prodali.
//        Spočítej celkový obrat (turnover) ze všech objednávek za jednotlivé dny.
//        Získej všechny názvy položek, které byly objednány. Pokud byla položka objednána vícekrát, ve výpisu bude jen jednou. Položky ve výpisu budou seřazené podle abecedy.
//        Spočítej počet objednávek pro jednotlivé stoly. Můžeš tak zjistit, u kterých stolů zákazníci nejraději sedí.
//        Data k otestování
//        Pokud vyzkoušíš následující objednávky:
//
//        stůl č. 1, 20. 5. 2021, hotově: Caesar salát, 150 Kč, 2 ks; Big Burger, 350 Kč, 1 ks; Mattoni, 30 Kč, 3 ks;
//        stůl č. 5, 18. 5. 2021, kartou: Big Burger, 350 Kč, 2 ks; Kofola velká, 30 Kč, 2 ks;
//        stůl č. 1, 20. 5. 2021, kartou: Svíčková na smetaně, 220 Kč, 1 ks; Big Burger, 350 Kč, 1 ks; Smažený hermelín, 135 Kč, 1 ks; Palačinky s jahodami, 160 Kč, 1 ks; Mattoni, 30 Kč, 2 ks; Malinovka domácí, 45 Kč, 2 ks;
//        stůl č. 2, 18. 5. 2021, kartou: Smažený hermelín, 135 Kč, 3 ks; Malinovka domácí, 45 Kč, 3 ks;
//        měl(a) bys dostat následující data:
//
//        úkol 3: Svíčková na smetaně=1, Big Burger=4, Mattoni=5, Smažený hermelín=4, Kofola velká=2, Malinovka domácí=5, Caesar salát=2, Palačinky s jahodami=1
//        úkol 4: 2021-05-20=1755, 2021-05-18=1300
//        úkol 5: Big Burger, Caesar salát, Kofola velká, Malinovka domácí, Mattoni, Palačinky s jahodami, Smažený hermelín, Svíčková na smetaně
//        úkol 6: Počet objednávek u stolů: stůl č. 1: 2, stůl č. 2: 1, stůl č. 5: 1.
//        Rozšíření
//        V rámci opakování z minulé lekce můžeš zkusit vyřešit i ukládání a načítání informací z textového souboru.



//public class Main {
//
//    private static Orders orders = new Orders();
//
//    public static void prepareData() {
//        try {
//            Order order;
//            order = new Order(1, LocalDate.of(2021, 05, 20), PaymentType.CASH);
//            order.addItem(new OrderItem("Caesar salát", 150, 2));
//            order.addItem(new OrderItem("Big Burger", 350, 1));
//            order.addItem(new OrderItem("Mattoni", 30, 3));
//            orders.add(order);
//            order = new Order(5, LocalDate.of(2021, 05, 18), PaymentType.CARD);
//            order.addItem(new OrderItem("Big Burger", 350, 2));
//            order.addItem(new OrderItem("Kofola velká", 30, 2));
//            orders.add(order);
//            order = new Order(1, LocalDate.of(2021, 05, 20), PaymentType.CARD);
//            order.addItem(new OrderItem("Svíčková na smetaně", 220, 1));
//            order.addItem(new OrderItem("Big Burger", 350, 1));
//            order.addItem(new OrderItem("Smažený hermelín", 135, 1));
//            order.addItem(new OrderItem("Palačinky s jahodami", 160, 1));
//            order.addItem(new OrderItem("Mattoni", 30, 2));
//            order.addItem(new OrderItem("Malinovka domácí", 45, 2));
//            orders.add(order);
//            order = new Order(2, LocalDate.of(2021, 05, 18), PaymentType.CARD);
//            order.addItem(new OrderItem("Smažený hermelín", 135, 3));
//            order.addItem(new OrderItem("Malinovka domácí", 45, 3));
//            orders.add(order);
//        } catch (OrdersException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        prepareData();
//        // 3. Na základě názvu položky spočítejte celkový počet kusů dané položky, které jsme prodali:
//        System.out.println(orders.itemsNumOfPieces());
//        // 4. Spočítejte celkový obrat (turnover) ze všech objednávek za jednotlivé dny:
//        System.out.println(orders.turnoverTotalPerDay());
//        // 5. Připravte metodu, která získá výpis všech názvů položek,
//        //  které byly objednány.
//        //  Pokud byla položka objednána vícekrát, ve výpisu bude jen jednou.
//        //  Položky ve výpisu budou seřazené podle abecedy.
//        SortedSet<String> items = orders.itemsSoldAlphabetically();
//        System.out.println(items);
//        // 6. Vypište počet objednávek pro jednotlivé stoly.
//        int[] ordersPerTable = orders.ordersPerTable();
//        System.out.println("Počet objednávek u jednotlivých stolů:");
//        for (int i = 0; i < ordersPerTable.length; i++) {
//            int numberOfOrdersOnThisTable = ordersPerTable[i];
//            if (numberOfOrdersOnThisTable > 0) {
//                System.out.println("Stůl č. " + i + ": \t" + numberOfOrdersOnThisTable);
//            }
//        }
//    }
//}