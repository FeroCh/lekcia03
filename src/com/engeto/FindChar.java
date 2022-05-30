package com.engeto;

public class FindChar {
    /** Ověřuje, zda je znak {@code pattern} obsažen v textu {@code text}.
     *  Napsáno jako cvičení - v praxi použijeme standarndí funkci: {@code text.contains(pattern);}
     *  OBSAHUJE CHYBU - je určeno pro ukázku debuggování!
     * @param pattern znak, který hledáme v textu
     * @param text text, ve kterém vyhledáváme {@code pattern}
     * @return {@code true} právě pokud je {@code pattern} obsažen v {@code text}
     */
    public static boolean isContained(char pattern, String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern) return true;
        }
        return false;
    }
//    public static void main(String[] args) {
//        System.out.println(isContained('x', "rabatnosxbanatkabanstop"));
//        System.out.println(isContained('x', "nosbankabanosbanatkabanstopx"));
//        System.out.println(isContained('x', "xnosbanxkabanosbxanatkabansxtopx"));
//        System.out.println(isContained('x', "kabatnosbanatkaban"));
//    }

    /** Ověřuje, zda je posloupnost znaků {@code pattern} obsažena v textu {@code text}.
     *  Napsáno jako cvičení - v praxi použijeme standarndí funkci: {@code text.contains(pattern);}
     *
     *  OBSAHUJE CHYBU - je určeno pro ukázku debuggování!
     *
     * @param pattern vzor, který hledáme
     * @param text text, ve kterém vyhledáváme {@code pattern}
     * @return {@code true} právě pokud je {@code pattern} obsažen v {@code text}
     */
    public static boolean isSubstringOf(String pattern, String text) {
        char charInText, charInPattern;
        NEXT_POSITION: // Start from each position in text and check pattern
        //Pokud se ve vnějším cyklu dostaneme s porovnáváním ke konci textu blíž,
        // než je délka vzorku, víme, že už vzorek do zbývající části textu nemůže vlézt.
        //Například v textu: abcbcab při hledání vzorku abcd stačí testovat, jestli se
        // vzorek vyskytuje na první, druhé, třetí nebo čtvrté pozici v textu. Nemá cenu
        // testovat pátou pozici, protože text je příliš krátký.
        //Pro opravu kódu tedy stačí upravit podmínku vnějšího cyklu: tj. od text.length() odcitat delku
        //vzorku : text.length()-pattern.length()
        for (int i = 0; i < text.length()-pattern.length(); i++) {
            // Check if pattern continues from this position:
            for (int j = 0; j < pattern.length(); j++) {
                charInText = text.charAt(i+j);
                charInPattern = pattern.charAt(j);
                if (charInText != charInPattern) continue NEXT_POSITION;
            }
            return true;
        }
        return false;
    }
    public static void printIsSubstringOf(String pattern, String text) {
        String result =  pattern + " is ";
        if (! isSubstringOf(pattern, text)) result += "NOT ";
        result += "substring of " + text + ".";
        System.out.println(result);
    }
    public static void main(String[] args) {
        printIsSubstringOf("kabanos", "kabatnosbanatkabanstop");
        printIsSubstringOf("kabanos", "nosbankabanosbanatkabanstop");
        printIsSubstringOf("kabanos", "kabatnosbanatkaban");
    }
}