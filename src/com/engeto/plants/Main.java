package com.engeto.plants;
import java.time.LocalDate;
public class Main {



//    Zadání Pokojové rostliny
//    Model dat — pokojová rostlina
//    Připravte třídu pro ukládání informací o pokojových rostlinách (plant).
//
//    U každé rostliny budeme mít uložen:
//    název (name),
//    poznámky (notes),
//    datum, kdy byly zasazena (planted),
//    datum poslední zálivky (watering)
//    běžnou frekvenci zálivky ve dnech (frequency of watering)
//    Vytvořte tři konstruktory:
//    jeden pro nastavení všech atributů
//    druhý nastaví jako poznámku prázdný řetězec a datum poslední zálivky nastaví na dnešní datum.
//    třetí nastaví totéž co druhý a navíc výchozí frekvenci zálivky na 7 dnů a datum zasazení na dnešní datum. (Uživatel tedy bude zadávat pouze název rostliny.)
//    Vytvořte výchozí přístupové metody pro všechny atributy.
//    Připravte metodu getWateringInfo(), která vrátí název květiny, datum poslední zálivky a datum doporučené další zálivky. (Metoda vrátí textový řetězec, obsahující požadované informace.)
//    Ošetření vstupů a výjimky
//    Volitelné v JA 2022.01 (na hodině jsme nestihli): Vytvořte novou třídu výjimek s názvem PlantException. Bude potomkem (extends) třídy Exception.
//
//    Návod pro JA 2022.01: Vytvořte novou třídu:
//
//    public class PlantException extends Exception {
//        public PlantException(String message) {
//            super(message);
//        }
//    }
//    Ošetřete zadávání frekvence zálivky — pokud je parametrem 0 nebo záporné číslo, systém vyhodí výjimku třídy PlantException s vhodným popisem.
//
//    JA2022.01: Stačí použít Exception nebo lépe vytvořte třídu PlantException podle návodu výše a pak volejte new PlantException("Popis chyby").)
//
//    Obdobně ošetřete zadávání data poslední zálivky — nesmí být starší než datum zasazení rostliny.
//
//    Vytvoření seznamu květin
//    Vytvořte třídu pro ukládání seznamu pokojových květin. Jako atribut bude mít kolekci, uchovávající květiny.
//    Přidejte metody pro přidání nové květiny, získání květiny na zadaném pořadí a odebrání květiny ze seznamu.
//    Načtení ze souboru
//    Přidejte do seznamu květin metodu pro načtení květin ze souboru.
//    V případě chybného vstupu vyhoďte výjimku.
//    Přidejte do seznamu květin metodu pro uložení aktualizovaného seznamu do souboru.
//            Ověření
//    Načtěte seznam květin ze souboru kvetiny.txt.
//    Vypište na obrazovku informace o zálivce pro všechny květiny.
//    Přidejte dvě nové květiny do seznamu. Jednu květinu odeberte.
//    Uložte seznam květin do nového souboru a ověřte, že je jeho obsah správný. Výsledný soubor by měl vypadat takto: vystup.txt.
//    Vyzkoušejte opětovné načtení vygenerovaného souboru.
//    Doporučené ověření navíc
//    Vyzkoušejte, že se aplikace bude chovat správně při načtení vadného souboru kvetiny-spatne-datum.txt.
//    Vyzkoušejte, že se aplikace bude chovat správně při načtení vadného souboru kvetiny-spatne-frekvence.txt.
}

//Vzorove riesenie od autora
//    private static final String INPUT_FILE = "kvetiny.txt";
//    // DEBUG: pro testovací účely: private static final String INPUT_FILE = "kvetiny-spatne-datum.txt";
//    // DEBUG: pro testovací účely: private static final String INPUT_FILE = "kvetiny-spatne-frekvence.txt";
//    // DEBUG: pro testovací účely: private static final String INPUT_FILE = "vystup.txt";
//    private static final String OUTPUT_FILE = "vystup.txt";
//
//    public static void main(String[] args) {
//        PlantList list = new PlantList();
//        try {
//            list.importPlantsFromFile(INPUT_FILE);
//        } catch (PlantException e) {
//            System.err.println(e.getLocalizedMessage());
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.getPlant(i).getWateringInfo());
//        }
//        list.addPlant(new Plant("Amarylis v obýváku"));
//        list.addPlant(new Plant("Bazalka v kuchyni", 3, LocalDate.now()));
//        list.removePlant(2);
//
//        try {
//            list.exportToFile(OUTPUT_FILE);
//        } catch (PlantException e) {
//            System.err.println(e.getLocalizedMessage());
//        }
//    }
//}
