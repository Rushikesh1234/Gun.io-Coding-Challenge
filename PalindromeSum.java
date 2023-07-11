/*

Palindromes
A palindrome is a word, number, phrase, or another sequence of characters which
reads the same backward as forward, such as madam, racecar, or the number
10801.

What is the sum of all numeric palindromes that are less than 10,000?


Answer - The sum of all numeric palindromes less than 10,000 is: 545040
 */

public class PalindromeSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            if (isPalindrome(i)) {
                sum += i;
            }
        }
        System.out.println("The sum of all numeric palindromes less than 10,000 is: " + sum);
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}