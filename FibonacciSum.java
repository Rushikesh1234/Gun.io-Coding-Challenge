/*
Fibonacci
The Fibonacci sequence begins like this:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
(each number is the sum of the previous two)

What is the sum of all odd numbers in the Fibonacci sequence that are less
than 10,000?

Answer - Sum of all odd Fibonacci numbers less than 10,000: 14328
 */

public class FibonacciSum {
    public static void main(String[] args) {
        int limit = 10000;
        int sum = 0;
        int prev = 0;
        int current = 1;

        while (current < limit) {
            if (current % 2 != 0) { // Check if the current number is odd
                sum += current;
            }
            int next = prev + current;
            prev = current;
            current = next;
        }

        System.out.println("Sum of all odd Fibonacci numbers less than 10,000: " + sum);
    }
}