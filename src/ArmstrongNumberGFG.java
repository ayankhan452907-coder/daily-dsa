// Problem: Armstrong Number (GeeksforGeeks)
// Pattern Signal: Extract digits, cube them, and accumulate a sum -> compare sum to original number.
// Time Complexity: O(1) - strictly 3 digits, so the loop always runs exactly 3 times.
// Space Complexity: O(1)

public class ArmstrongNumberGFG {
    public static boolean armstrongNumber(int n) {
        int mul = 0;
        int ncopy = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            mul = digit * digit * digit;
            n /= 10;
            sum = sum + mul;
        }

        return ncopy == sum;
    }

    public static void main(String[] args) {
        System.out.println(armstrongNumber(153)); // Output: true
        System.out.println(armstrongNumber(372)); // Output: false
        System.out.println(armstrongNumber(100)); // Output: false
    }
}
