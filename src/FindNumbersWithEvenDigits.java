
    // Problem: LeetCode 1295 - Find Numbers with Even Number of Digits
// Pattern Signal: Array iteration + digit counting -> inspect each element's length via division/log10 and check parity (len % 2 == 0).
// Time Complexity: O(n * log10(max_val))
// Space Complexity: O(1)
// Note: Scanner is not added here; input array is initialized directly in main.

    public class FindNumbersWithEvenDigits {
        public static int findNumbers(int[] nums) {
            int evenDigitCount = 0;

            for (int num : nums) {
                int digits = 0;
                int temp = num;

                while (temp > 0) {
                    temp /= 10;
                    digits++;
                }

                if (digits % 2 == 0) {
                    evenDigitCount++;
                }
            }

            return evenDigitCount;
        }

        public static void main(String[] args) {
            int[] nums = {12, 345, 2, 6, 7896};
            System.out.println(findNumbers(nums)); // Output: 2 (12 and 7896)
        }
    }

