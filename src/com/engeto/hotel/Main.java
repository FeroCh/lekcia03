package com.engeto.hotel;

public class Main {
}

//        Domácí úkol — Hotel
//        Tvým úkolem je:
//
//        připravit třídy pro následující zadání.
//        Vytvořit konstruktory a přístupové metody.
//        Každé ze tříd vytvoř metodu getDescription, která vrátí čitelný textový popis.
//        Poté vytvoř vzorovou testovací aplikaci v metodě main.
//        Zadání
//        Potřebujeme evidovat hosty (guest), které ubytováváme v hotelu.
//
//        O každém hostu musíme uložit jméno, příjmení a datum narození.
//
//        Hosty vždy ubytováváme na pokojích (room). Pokoj je identifikován svým číslem. O každém pokoji chceme evidovat, kolik lůžek tam je (neřeš přistýlky apod.), zda má pokoj balkón a zda má výhled na moře a jaká je cena pokoje za jednu noc (předpokládej, že je cena pevně daná bez ohledu na sezónu a počet ubytovaných).
//
//        V rámci jedné rezervace (booking) vždy přiřazujeme pokoj jednomu nebo více hostům na časové období mezi dvěma daty (například pokoj číslo 3 na období od 15. 7. do 24. 7. 2021). Pobyt je buď pracovní, nebo rekreační.
//
//        Chceme také mít k dispozici třídu, která bude uchovávat všechny rezervace (například list of bookings), které jsme v systému vytvořili a bude mít metodu, která vypíše informace o všech rezervacích.
//
//        Testovací aplikace
//        Do kódu metody main připrav následující testovací aplikaci:
//
//        Vytvoř hosty Adélu Malíkovou (narozena 13. 3. 1993) a Jana Dvořáčka (narozen 5.5.1995). Vypiš na obrazovku jejich popis (description).
//        Vytvoř pokoje a vypiš na obrazovku jejich popis:
//        pokoj číslo 1 a pokoj číslo 2 jsou jednolůžkové za cenu 1000 Kč/noc, s balkonem a výhledem na moře.
//        pokoj číslo 3 je trojlůžkový za cenu 2400 Kč/noc, bez balkónu, s výhledem na moře.
//        Připrav rezervace:
//        pro Adélu na pokoj č. 1 od 19. do 26. 7. 2021.
//        pro oba (společná rezervace) na pokoj č. 3 od 1. do 14. 9. 2021.
//        Vypiš seznam všech rezervací.
//        Zkontroluj si: zajímavé body, challenge a časté chyby
//        Je rozlišen pracovní a rekreační pobyt? (Zde se hodí enum jako možné volitelné rozšíření navíc.)
//        Lze evidovat více hostů v rámci jedné rezervace?
//        Můžeme sledovat historii rezervací? Nepřepíše se novou rezervací informace o původní rezervaci? (Údaje o rezervaci by neměly být součástí hosta ani pokoje.)
//        Volitelně můžeš zkusit zařídit, aby se při vytváření rezervace rezervovalo automaticky na rekreační pobyt od dneška na dalších 6 nocí, pokud nezadáš konkrétní data začátku a konce. (Pokud uvedeš všechny parametry rezervace, použijí se tak, jak jsou zadané.)


//    public static void main(String[] args) {
//        // 1. Vytvoří klienty Adélu Malíkovou (narozena 13. 3. 1993) a&nbsp;Jana Dvořáčka (narozen 5.5.1995).
//        Guest adela = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
//        Guest jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
//        System.out.println(adela.getDescription());
//
//        // 2. Vytvoří pokoje číslo 1 a&nbsp;2, které budou jednolůžkové za cenu 900&nbsp;Kč/noc. Vypište na obrazovku jejich popis (description).
//        // 3. Vytvoří pokoj číslo 3, který bude trojlůžkový za cenu 2400&nbsp;Kč/noc. Vypište na obrazovku jejich popis (description).
//        Room room1 = new Room(1, 1, true, true, 1000);
//        System.out.println(room1.getDescription());
//        Room room2 = new Room(2, 1, true, true, 1000);
//        System.out.println(room2.getDescription());
//        Room room3 = new Room(3, 3, false, true, 2400);
//        System.out.println(room3.getDescription());
//        // 4. Připrav rezervace:
//        // - pro Adélu na pokoj č.&nbsp;1 od 19. do 26. 7. 2021.
//        // - pro oba (společná rezervace) na pokoj č. 3 od 1. do 14. 9. 2021.
//        Bookings bookings = new Bookings();
//        Booking booking = new Booking(adela, room1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), TypeOfStay.HOLIDAY);
//        bookings.addBooking(booking);
//        booking = new Booking(adela, room3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfStay.WORKING);
//        booking.addGuest(jan);
//        bookings.addBooking(booking);
//        // 5. Vypiš seznam všech rezervací.
//        bookings.printBookings();
//    }
//}