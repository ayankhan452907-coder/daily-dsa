// Problem: Reverse Digits (GeeksforGeeks)
// Pattern Signal: Extract digits via n % 10, append via rev * 10 + digit, shrink via n / 10.
// Leading zeroes naturally drop because 0 * 10 + 0 remains 0.
// Time Complexity: O(log10 n)
// Space Complexity: O(1)
// Note: Scanner is not added here; test inputs are passed directly in main.

    public class ReverseDigitsGFG {
        public static int reverseDigits(int n) {
            int revnum = 0;

            while (n > 0) {
                revnum = (revnum * 10) + (n % 10);
                n /= 10;
            }

            return revnum;
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println("Reverse of 122: " + reverseDigits(122));     // Output: 221
            System.out.println("Reverse of 200: " + reverseDigits(200));     // Output: 2
            System.out.println("Reverse of 12345: " + reverseDigits(12345)); // Output: 54321
        }
    }

