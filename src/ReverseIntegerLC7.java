// Problem: LeetCode 7 - Reverse Integer
// Pattern Signal: Integer reversal with 32-bit overflow boundary checks before multiplying by 10.
// Check if revnum > MAX/10 or revnum < MIN/10 before updating revnum.
// Time Complexity: O(log10 |x|) - at most 10 iterations for a 32-bit int
// Space Complexity: O(1) - strictly 32-bit integer arithmetic (no 64-bit/long used)
// Note: Scanner is not added here; test inputs are passed directly in main.

public class ReverseIntegerLC7 {
    public static int reverse(int x) {
        int revnum = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check overflow before multiplying by 10
            if (revnum > Integer.MAX_VALUE / 10 || (revnum == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            // Check underflow before multiplying by 10
            if (revnum < Integer.MIN_VALUE / 10 || (revnum == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            revnum = (revnum * 10) + digit;
            x /= 10;
        }

        return revnum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Reverse 123: " + reverse(123));               // Output: 321
        System.out.println("Reverse -123: " + reverse(-123));             // Output: -321
        System.out.println("Reverse 120: " + reverse(120));               // Output: 21
        System.out.println("Reverse 1534236469 (overflow): " + reverse(1534236469)); // Output: 0
    }
}
