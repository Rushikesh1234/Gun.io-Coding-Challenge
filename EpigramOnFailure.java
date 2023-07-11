/*
Epigram on Failure
Given the following quote by Alan Perlis

“Dealing with failure is easy: Work hard to improve. Success is also easy to
handle: You’ve solved the wrong problem. Work hard to improve.”

Considering only the alphabetical characters, consonants having the value of
their ASCII codes, and vowels having the inverse value of their ASCII codes,
what is the sum of the sentence?

Example:
Using the phrase “why and how”, w=119, h=104, y=121, d=100, n=110. A and O are vowels, so a=-97 o=-111. The sum of ‘why and how’ = 569.


Answer - The sum of the sentence is: 2865
 */

public class EpigramOnFailure {
    public static void main(String[] args) {
        String sentence = "Dealing with failure is easy: Work hard to improve. Success is also easy to handle: Youve solved the wrong problem. Work hard to improve.";

        int sum = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                int asciiValue = (int) c;
                if (isVowel(c)) {
                    sum -= asciiValue;
                } else {
                    sum += asciiValue;
                }
            }
        }

        System.out.println("The sum of the sentence is: " + sum);
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}