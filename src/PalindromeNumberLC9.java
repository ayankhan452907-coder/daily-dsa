// Problem: LeetCode 9 - Palindrome Number
// Pattern Signal: Integer reversal -> reverse the number and compare it to a saved copy of the original.
// Time Complexity: O(log10 x)
// Space Complexity: O(1)

public class PalindromeNumberLC9 {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int xcopy = x;
        int revnum = 0;

        while (x != 0) {
            int digits = x % 10; // Moved inside the loop to update every time
            revnum = revnum * 10 + digits;
            x /= 10;
        }

        if (xcopy != revnum) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // Output: true
        System.out.println(isPalindrome(-121)); // Output: false
        System.out.println(isPalindrome(10));   // Output: false
    }
}