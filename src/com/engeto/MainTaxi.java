package com.engeto;

import java.text.ParseException;

public class MainTaxi {
    private static void printRequest(Request request){
            System.out.println(
                    "Počet pasažérů: "
                            +request.getNumberOfPassengers());
        }
    public static void main(String[] args) throws ParseException {
        //Vytvoř si instanci třídy Request.
        Request request = new Request();
        //Poté nastává část kódu, kde může nastat chyba:
        //Začni blok kódu klíčovým slovem try a složenými závorkami.
        //   Do složených závorek zapiš kód, kde může nastat chyba.
        try {
            // První změna proběhne v pořádku:
            request.setNumberOfPassengers(3);
            printRequest(request);
            // Při druhé změně nastane chyba:
            request.setNumberOfPassengers(-1);
            // Proto se tato část kódu vůbec neprovede
            // - přeskočí se rovnou na ošetření chyby:
            printRequest(request);
//          Na konci bloku zapiš klauzuli catch.
//          Pokud dojde k chybě, provádění bloku se ukončí a přeskočí se
//          rovnou na klauzuli catch, kde je popsáno zpracování chyby.
//          Zde v reakci na chybu vypíšeme chybové hlášení do textové konzole,
//          protože jsme v konzolové aplikaci. V mobilní nebo webové aplikaci
//          bychom použili odpovídající způsob upozornění uživatele.
        } catch (TaxiException ex) {
            System.err.println("Chyba při nastavení počtu pasažérů: "
                    +ex.getMessage());
        }

        try {
            throw new ParseException("Test hlídané výjimky!", 50);
        } catch (ParseException e) {
            e.printStackTrace();
        }throw new ParseException("Test hlídané výjimky!", 50);

    }
}
