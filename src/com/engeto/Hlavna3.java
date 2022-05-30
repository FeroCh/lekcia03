package com.engeto;

public class Hlavna3 {
    public static final int DISCOUNT_TOP = 500;

    public static void main(String[] args) {
        DriversLicenceType typOpravneni;
        // String typOpravneni2 = "XYZ";
        // int typOpravneni3 = 0;

        typOpravneni = DriversLicenceType.A;
        System.out.println(typOpravneni);

        TypeOfStay type = TypeOfStay.RECREATIONAL;
        System.out.println(type);
        type = TypeOfStay.WORKING;
        System.out.println(type);
        type = TypeOfStay.WORKING;

        // Větvení - příkaz if

        // typ jsem mohl například načíst ze souboru
        //  - neznám jeho hodnotu
        int priceOfStay = 5000;
        if (type.equals(TypeOfStay.RECREATIONAL)) {
            priceOfStay = priceOfStay + 200;
        } else {
            priceOfStay = priceOfStay + DISCOUNT_TOP;
        }
        boolean isVip = false;
        // Nedoporučuji: ====
        if (type.equals(TypeOfStay.RECREATIONAL))
            priceOfStay = priceOfStay + 200;
        // ==================
        // Bez problémů:
        if (type.equals(TypeOfStay.RECREATIONAL)) priceOfStay = priceOfStay + 200;

        if (! isVip) priceOfStay = priceOfStay + 200;

        if (priceOfStay == 1000) {
            //...
        }

//		if (priceOfStay > 2000) {
//			priceOfStay = priceOfStay - 100;
//		}
        // & se píše pravý Alt+C  | se píše pravý Alt+W
        if (priceOfStay >= 5000 && isVip) { // menší nebo rovno: <=
            // && ... musí být splněny obě podmínky
            priceOfStay = priceOfStay - DISCOUNT_TOP;
            // Kratší zápis: priceOfStay -= DISCOUNT_TOP;
        } else if (priceOfStay >= 2000 || isVip) {
            // || ... stačí splnit kteroukoli z podmínek (nebo obě)
            priceOfStay = priceOfStay - 100;
        } else {
            priceOfStay = priceOfStay - 20;
        }

        String name1 = "Karel";
        String name2 = "Kare";
        name2 += "l";
        if (name1.equals(name2)) {
            System.out.println(name1 + " je stejné jako "+name2);
        } else {
            System.out.println(name1 + " je jiné než "+name2);
        }
        // POZOR:
        //  toto nefunguje - testuje, jestli je to stejný objekt:
        if (name1 == name2) {
            System.out.println(name1 + " je stejné jako "+name2);
        } else {
            System.out.println(name1 + " je jiné než "+name2);
        }

        int dayOfWeek = 1;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Začíná týden - hurá do práce!");
                break;
            case 5:
                System.out.println("Hurá na víkend!!!!");
                break;
            default:
                System.out.println("Normálka...");
        }
    }
}