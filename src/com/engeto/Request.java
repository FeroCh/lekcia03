package com.engeto;

public class Request {

    // ... další atributy
    int numberOfPassengers;
    // ... konstruktory a další metody

//        Jak jsme ošetřili chybový stav?
//        1. throws TaxiException
//        V rámci volání metody setNumberOfPassengers můžeme narazit na to, že
//        uživatel zadal špatný počet pasažárů (menší než jedna). Proto do hlavičky
//        metody přidáme text throws TaxiException, kterým upozorníme, že tato metoda
//        může vyvolat chybový stav a tento bude potřeba ošetřit.
    public void setNumberOfPassengers(int passengers) throws TaxiException {
//        2. throw new TaxiException
//        Pokud zjistíme, že došlo k chybě, vytvoříme nový objekt třídy TaxiException
//        a klíčovým slovem throw vyvoláme ošetření výjimky.
        if (numberOfPassengers < 1) {
            throw new TaxiException("Počet pasažérů nesmí být nižší než 1"
                    +" (zadal jsi : "+passengers+")");
        }
//        Dále kód pokračuje, jako by chyba nenastala.
//        Všimni si, že dále již metoda pokračuje, jako by chyba nenastala.
//        To mám zbytek kódu výrazně zpřehlední.
//        Pokud chyba nastane, metoda skončí voláním throw a zbytek se již neprovede.
        numberOfPassengers = passengers;
    }
//      Všimni si, že zde neříkáme, jak se má na chybu zareagovat. Třídu Request totiž
//      můžeš v rámci znovupoužitelnosti kódu použít v různých aplikacích a každá
//      aplikace vyžaduje jiný způsob ošetření chyby. V mobilní aplikaci například
//      označíme chybně zadané pole červeně, ve webové aplikaci vrátíme do webového API
//      chybový kód.
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

}
