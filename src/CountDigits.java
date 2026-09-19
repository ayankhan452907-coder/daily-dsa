// Problem: Count Digits (GeeksforGeeks)
// Pattern Signal: Count digits in an integer -> repeatedly divide by 10 until 0, counting iterations (O(log10 n)).
// Time Complexity: O(log10 n)
// Space Complexity: O(1)
// Note: Scanner is not added here; test inputs are passed directly in main for fast local verification.

public class CountDigits {
    public static int countDigits(int n) {
        if (n == 0) return 1; // Edge case: 0 has 1 digit

        int count = 0;
        n = Math.abs(n); // Handle negative numbers

        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(12345)); // Output: 5
        System.out.println(countDigits(0));     // Output: 1
    }
}
