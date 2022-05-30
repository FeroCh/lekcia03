package com.engeto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hlavni2 {
//         to co som vytvoril pri cviceni ja
//        public static void main(String[] args) {
//            Computer yvoninApple =
//                    new Computer(
//                            "Apple XBook", 1.35,
//                            13.3, true, true);
//            Computer karluvDell = new Computer("Dell XYZ", 1.3);
//
//            List<Computer> computerList = new ArrayList<>();
//            computerList.add(yvoninApple);
//            computerList.add(karluvDell);
//        }
//}
// lektorovo riesenie z hodiny:

    public static void main(String[] args) {
        Computer adamsLaptop;
        String customerName;
        customerName = "Adam";

        // Vytvoř objekt třídy Computer a ulož ho do proměnné:
        adamsLaptop = new Computer(
                "XYZ Databook 13", 13.3,
                true,
                LocalDate.of(2019, 8, 31),
                4,
                BigDecimal.valueOf(38419.9));
        Computer evasLaptop = new Computer(
                LocalDate.of(2022, 4, 1),
                BigDecimal.valueOf(24990)
        ),
                karelsDesktop = new Computer(
                        LocalDate.of(2022, 4, 1),
                        BigDecimal.valueOf(24990)

                );

        adamsLaptop.setLaptop(true);
        karelsDesktop.setLaptop(false);

        adamsLaptop.setModel("XYZ Databook 15");
        int value = 15;
        adamsLaptop.setModel(""+value);
        adamsLaptop.setDiagonal(15.7); // správně!
        // špatně: adamsLaptop.diagonal = 13.3;
        // Proč je špatně - porušuje „zapouzdření“ třídy!
        //adamsLaptop.setDateOfPurchase(
        //        LocalDate.of(2020, 12, 15));

        System.out.println(
                adamsLaptop.getModel()
                        + " (" + adamsLaptop.getDiagonal() + "\")");

        System.out.println(adamsLaptop.getDescription());

        adamsLaptop.printDescription();

        // Kolekce (ArrayList):

        List<Computer> computers = new ArrayList<>();

        computers.add(adamsLaptop);

        computers.clear(); // vyřadí všechny prvky ze seznamu

        computers.add(evasLaptop);
        computers.add(
                new Computer(LocalDate.now(),
                        BigDecimal.ZERO));

        System.out.println(
                "Počet počítačů v seznamu: "+ computers.size());

        computers.remove(1); // index je od 0... první počítač
        computers.remove(evasLaptop);

        System.out.println(
                "Počet počítačů v seznamu: "+ computers.size());

        computers.add(adamsLaptop);
        computers.add(evasLaptop);
        computers.add(
                new Computer(LocalDate.now(),
                        BigDecimal.ZERO));

        System.out.println(computers);
        System.out.println(adamsLaptop.getDescription());
        System.out.println(adamsLaptop);

        for (int i = 0; i < computers.size(); i++) {
            System.out.println(""+i+": "+computers.get(i));
        }

        int i = 1;
        for (Computer computer : computers) {
            System.out.println(""+i+": "+computer);
            i++;
        }
    }
}
