package com.engeto.vozovy_park;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    LocalDate today = LocalDate.now();
    LocalDate dateOfExpiry = LocalDate.now().minusMonths(11);

    public static void main(String[] args) {
        Car skoda = new Car("Škoda","Octavia","1A23425", LocalDate.of(2021,7,1), BigDecimal.valueOf(98405));
        Car opel = new Car("Opel","Astra","4T67788",LocalDate.of(2021,7,14),BigDecimal.valueOf(161914));
        Car renault = new Car("Renault","Megane","",LocalDate.of(2021,8,25),BigDecimal.valueOf(157352));

        Cars cars = new Cars();
        cars.addCars(skoda);
        cars.addCars(opel);
        cars.addCars(renault);
        for (int j = 1;j < 21; j ++){
            Car hyundai = new Car("Hyundai","i40","ENGETO00"+j,LocalDate.of(2022,7,15),BigDecimal.valueOf(40));
            cars.addCars(hyundai);
        }
        cars.printCars();
        System.out.println("Vozidla ktera maji jit k TP nasledujici mesic:");
        cars.technicalCheck();



//       for (Car car : cars){
//           if(getLastTechnicalCheck.isBefore.dateOfExpiry ) {
//                System.out.println("Vozidlo pujde k TP v nasledujicim mesici");
//            }
//        }



// vydumat ako vyhodnotit, ze aktualny datum je viac ako 11 mesiacov od poslednej kontroly.
// pozriet "kuzla"s datami v dokumentacii.
//        for (Car car : cars){
//            if(lastTechnicalCheck > ){
//
//            }
//        }

    }
}
//PROJEKT: VOZOVÝ PARK
// Zadání
// Zapiš aplikaci, která bude ukládat a zpracovávat data o vozidlech firemní flotily aut.
// O každém vozidle ukládáme následující údaje:
// značku (make): textová položka,
// typ (type): textová položka,
// registrační značka (vehicleRegistrationPlate): text bez mezer,
// datum poslední STK (lastTechnicalCheck): datum,
// najetá vzdálenost (mileage): celé číslo.
// Připrav objekty s následujícími hodnotami:
//
// Škoda   Octavia 1A23425 2020-07-12  98405
// Opel    Astra   4T67788 2018-11-13  161914
// Renault    Megane   2B38736 2018-10-28  157352
// Datum poslední STK si uprav podle aktuálního kalendářního data tak,
// aby některá vozidla měla plánovanou technickou kontrolu v následujícím měsíci.
//
// Připrav metody pro následující operace:
// Vypiš značku, model a registrační značku vozidel, které mají jít na STK tento měsíc (tedy předchozí STK proběhla před více než 11 měsíci).
// Přidej do vozového parku 20 nových vozidel Hyundai i40 s registračními značkami ENGETO01 až ENGETO20 s nájezdem 40 km. Všechny absolvovaly technickou kontrolu právě dnes. (Pro přidání použijte cyklus, mačkat Ctrl-C a Ctrl-V by tě stejně nebavilo!)
// Postup
// Připrav třídu pro ukládání údajů o vozidlech.
// Připrav kolekci pro ukládání objektů třídy vozidlo.
// Vytvoř objekty, reprezentující jednotlivá vozidla.
// Vlož do kolekce údaje o vozidlech.
// Vypiš vozidla, která mají jít na technickou kontrolu v následujícím měsíci.

