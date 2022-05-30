package com.engeto;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class WeekDays {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2020, 10, 27); // Vytvoříme objekt s datem 27.10.2020.
        DayOfWeek day = today.getDayOfWeek();         // Zjistíme den v týdnu.
        // Výpis anglicky:
        System.out.println(day);                      // -> TUESDAY
        // Výpis podle národního nastavení operačního systému:
        String dayAsText = day.getDisplayName(
                TextStyle.FULL_STANDALONE,
                Locale.getDefault());
        // -> úterý
        System.out.println(dayAsText);
    }
}
