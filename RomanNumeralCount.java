/*
Legionnaries
In the range 1 - 13 (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13) the digit 1
occurs 6 times.

In the range, 1 - 2,660 (half the number of Romans in a legion), expressed in
Roman numerals, how many times does the numeral “X” occur?



Answer - The numeral "X" occurs 3977 times.
 */


public class RomanNumeralCount {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 2660; i++) {
            String romanNumeral = toRomanNumeral(i);
            count += countOccurrences(romanNumeral, "X");
        }
        System.out.println("The numeral \"X\" occurs " + count + " times.");
    }

    private static String toRomanNumeral(int number) {
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder romanNumeral = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                romanNumeral.append(romanSymbols[i]);
                number -= values[i];
            }
        }
        return romanNumeral.toString();
    }

    private static int countOccurrences(String text, String pattern) {
        int count = 0;
        int index = 0;
        while (index != -1) {
            index = text.indexOf(pattern, index);
            if (index != -1) {
                count++;
                index += pattern.length();
            }
        }
        return count;
    }
}