package com.engeto.project1;

//public class Main {
//}

//        ZADÁNÍ
//        Motto
//        Na prvním projektu by sis měl(a) ověřit, že jsi zvládl(a) učivo prvních šesti lekcí.
//
//        K projektu nebudeš mít vzorové řešení.
//
//        Své řešení bys měl(a) odevzdat ve formě odkazu na repozitář, který si pro tento účel vytvoříš.
//
//        Tvůj úkol
//        Naprogramuj aplikaci v Javě, která vypíše všechny státy Evropské unie, které mají sazbu daně z přidané hodnoty (DPH, VAT) vyšší, než 20 % a nepoužívají speciální sazbu DPH/VAT.
//
//        Aktuální data o jednotlivých státech a jejich daních dostaneš v souboru — vzorový soubor je ke stažení zde: vat-eu.csv.
//
//        Vstupní soubor bude ve stejné složce, jako projekt aplikace.
//
//        Formát vstupního souboru
//        Na každém řádku vstupního souboru jsou informace o jednom státu v následujícím formátu:
//
//        zkratka státu (například AT)
//
//        název státu (Austria)
//
//        plná sazba daně z přidané hodnoty v procentech (20)
//
//        snížená sazba daně z přidané hodnoty v procentech (10)
//
//        informace o tom, jestli země používá speciální sazbu DPH pro některé produkty (true/false)
//
//        Jednotlivé hodnoty jsou odděleny vždy tabulátorem (v Javě zapíšeme tabulátor jako "\t").
//
//        Příklad několika řádků souboru:
//
//        AT  Austria 20  10  true
//        BE  Belgium 21  12  true
//        BG  Bulgaria    20  9   false
//        CY  Cyprus  19  9   false
//        CZ  Czech Republic  21  15  false
//        Poznámka: Všimni si, že v souboru jsou použity desetinné čárky.
//
//        Je potřeba je buď:
//
//        nahradit za desetinné tečky (jednodušší varianta, hledej, jak nahradit v textovém řetězci znaky),
//        nebo k načítání desetinných čísel použít Scanner a vhodné národní nastavení.
//        Je to trochu výzva — i v praxi mnohokrát potkáš situaci, kdy si nějaký kód musíš najít na webu. Věříme, že to zvládneš!
//
//        Výstup aplikace
//        Postupně zpracuj tyto kroky:
//
//        Načti ze souboru všechna data do vhodné datové struktury (vytvoř třídu pro uložení dat).
//
//        Vypiš seznam všech států a u každého uveď základní sazbu daně z přidané hodnoty ve formátu podle vzoru:
//
//        Název země (zkratka): základní sazba %
//        Například:
//
//        Austria (AT): 20 %
//        Belgium (BE): 21 %
//        ...
//        Vypiš ve stejném formátu pouze státy, které mají základní sazbu daně z přidané hodnoty vyšší než 20 % a přitom nepoužívají speciální sazbu daně.
//
//        Výpis z bodu 3. seřaď podle výše základní sazby DPH/VAT sestupně (nejprve státy s nejvyšší sazbou).
//
//        Pod výpis z bodu 3. doplň řádek s rovnítky pro oddělení a poté seznam zkratek států, které ve výpisu nefigurují. Opět dodrž formát podle vzoru (místo tří teček budou další státy):
//
//        Sweden (SE):    25 % (12 %)
//        Croatia (HR):   25 % (13 %)
//        ...
//        Finland (FI):   24 % (14 %)
//        ...
//        ====================
//        Sazba VAT 20 % nebo nižší nebo používají speciální sazbu: AT, CY, CZ,...
//        Výsledný výpis zapiš také do souboru s názvem vat-over-20.txt. Výstupní soubor ulož do stejné složky, ve které byl vstupní soubor. (Výpis na obrazovku zůstává.)
//
//        Doplň možnost, aby uživatel z klávesnice zadal výši sazby DPH/VAT, podle které se má filtrovat. Vypíší se tedy státy se základní sazbou vyšší než ta, kterou uživatel zadal.
//
//        Pokud uživatel zmáčkne pouze Enter, jako výchozí hodnota se použij jako výchozí sazbu 20 %.
//        Uprav název výstupního souboru tak, aby reflektoval zadanou sazbu daně. Například pro zadanou sazbu 17 % se vygeneruje soubor vat-over-17.txt a pro sazbu 25 % se vygeneruje soubor vat-over-25.txt.
//        ZKONTROLUJ SI!
//        Zajímavé body, challenge
//        Je dobré kód napsat tak, aby kód prošel jen jednou a rozdělil státy na „přes“ a „pod“ limit.
//        (Aby nebylo potřeba procházet seznam dvakrát.)
//        Tvůj program by měl zvládnout vstup s desetinnými čísly s desetinnou čárkou.
//        Historie projektu v Gitu
//        Během tvorby projektu vytvářej snímky (commity) a odesílej je průběžně do vzdáleného repozitáře na GitHubu. Piš smysluplné „commit messages“ tak, aby se v historii dalo přehledně orientovat.
//
//        Máš dotazy?
//        Pokud máš k zadání dotazy, nebo narazíš na problém, se kterým si delší dobu nevíš rady, obrať se na lektora.


//public class Main {
//    public static void mainMap(String[] args) {
//        ModelMap model = new ModelMap();
//        model.readFromFile("vat-eu.csv");
//        TreeMap<Double, State> statesToPrint = model.getSorted();
//        System.out.println("States of the EU with VAT (sorted):");
//        for (State s : statesToPrint.values()) {
//            System.out.println(s.name + " ("+s.getVat()+" %)");
//        }
//    }
//
//    public static void main1(String[] args) {
//        Model model = new Model();
//        model.readFromFile("vat-eu.csv");
//        System.out.println("Enter VAT limit:");
//        Scanner input = new Scanner(System.in);
//        double limit = input.nextDouble();
//        ArrayList<State> statesToPrint = model.findStatesWithVatOver(limit);
//        System.out.println("States of the EU with VAT over: "+limit+":");
//        for (State s : statesToPrint) {
//            System.out.println(s.name + " ("+s.getVat()+" %)");
//        }
//    }
//    public static void main(String[] args) {
//        Model model = new Model();
//        model.readFromFile("vat-eu.csv");
//        System.out.println("States of the EU sorted by VAT:");
//        for (State s : model.getStatesSorted()) {
//            System.out.println(s.name + " ("+s.getVat()+" %)");
//        }
//    }
//}