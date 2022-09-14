package com.engeto.Hotel2;

import com.engeto.Computer;
import com.engeto.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1.
        Guest adela = new Guest("Adela", "Malikova", LocalDate.of(1993, 3, 13));
        Guest jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        System.out.println(adela.getHostDescription());
        //2.
        //3.
        Room jedna = new Room(1, 1, true, true, 1000);
        Room dva = new Room(2, 1, true, true, 1000);
        Room tri = new Room(3, 3, false, true, 2400);
        List<Room> rooms = new ArrayList<>();
        rooms.add(jedna);
        rooms.add(dva);
        rooms.add(tri);
        System.out.println();
        for (Room room : rooms) {
            //System.out.println(room.roomDescription());
            if (!room.isBalcony) {
                System.out.println(room.roomDescription() + ", bez balkónu a výhledem na moře.");
            } else {
                System.out.println(room.roomDescription() + ", s balkonem, s výhledem na moře.");
            }
        }
        //4.
        //        Připrav rezervace:
        //        pro Adélu na pokoj č. 1 od 19. do 26. 7. 2021.
        //        pro oba (společná rezervace) na pokoj č. 3 od 1. do 14. 9. 2021.
        Bookings bookings = new Bookings();
        Booking booking = new Booking(adela, jedna, LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),TypeOfCommorancy.RECREATION);
        bookings.addBookings(booking);
        booking = new Booking(adela, tri,LocalDate.of(2021,9,1),LocalDate.of(2021,9,14), TypeOfCommorancy.WORK);
        booking.addGuest(jan);
        bookings.addBookings(booking);
        //5.
        //Vypiš seznam všech rezervací.
        bookings.printBookings();
    }
}
//        Domácí úkol — Hotel
//        Tvým úkolem je:
//
//        připravit třídy pro následující zadání.
//        Vytvořit konstruktory a přístupové metody.
//        Každé ze tříd vytvoř metodu getDescription, která vrátí čitelný textový popis.
//        Poté vytvoř vzorovou testovací aplikaci v metodě main.
//
//        Zadání
//        Potřebujeme evidovat hosty (guest), které ubytováváme v hotelu.
//        O každém hostu musíme uložit jméno, příjmení a datum narození.
//
//        Hosty vždy ubytováváme na pokojích (room). Pokoj je identifikován svým číslem.
//        O každém pokoji chceme evidovat, kolik lůžek tam je (neřeš přistýlky apod.),
//        zda má pokoj balkón a zda má výhled na moře a jaká je cena pokoje za jednu noc
//        (předpokládej, že je cena pevně daná bez ohledu na sezónu a počet ubytovaných).
//
//        V rámci jedné rezervace (booking) vždy přiřazujeme pokoj jednomu nebo více hostům
//        na časové období mezi dvěma daty (například pokoj číslo 3 na období od 15. 7. do 24. 7. 2021).
//        Pobyt je buď pracovní, nebo rekreační.
//
//        Chceme také mít k dispozici třídu, která bude uchovávat všechny rezervace
//        (například list of bookings), které jsme v systému vytvořili a bude mít metodu,
//        která vypíše informace o všech rezervacích.
//
//        Testovací aplikace
//        Do kódu metody main připrav následující testovací aplikaci:
//
//        Vytvoř hosty Adélu Malíkovou (narozena 13. 3. 1993) a Jana Dvořáčka (narozen 5.5.1995).
//        Vypiš na obrazovku jejich popis (description).
//        Vytvoř pokoje a vypiš na obrazovku jejich popis:
//        pokoj číslo 1 a pokoj číslo 2 jsou jednolůžkové za cenu 1000 Kč/noc,
//        s balkonem a výhledem na moře.
//        pokoj číslo 3 je trojlůžkový za cenu 2400 Kč/noc, bez balkónu,
//        s výhledem na moře.
//        Připrav rezervace:
//        pro Adélu na pokoj č. 1 od 19. do 26. 7. 2021.
//        pro oba (společná rezervace) na pokoj č. 3 od 1. do 14. 9. 2021.
//        Vypiš seznam všech rezervací.
//        Zkontroluj si: zajímavé body, challenge a časté chyby
//        Je rozlišen pracovní a rekreační pobyt? (Zde se hodí enum jako možné volitelné rozšíření navíc.)
//        Lze evidovat více hostů v rámci jedné rezervace?
//        Můžeme sledovat historii rezervací? Nepřepíše se novou rezervací informace o původní rezervaci?
//        (Údaje o rezervaci by neměly být součástí hosta ani pokoje.)
//        Volitelně můžeš zkusit zařídit, aby se při vytváření rezervace rezervovalo automaticky na
//        rekreační pobyt od dneška na dalších 6 nocí, pokud nezadáš konkrétní data začátku a konce.
//        (Pokud uvedeš všechny parametry rezervace, použijí se tak, jak jsou zadané.)
