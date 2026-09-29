// Problem: GCD of Two (GeeksforGeeks)
// Pattern Signal: Euclidean Algorithm -> repeatedly replace larger with (larger % smaller)
// Time Complexity: O(log(min(a, b)))
// Space Complexity: O(1)

public class GCDofTwoGFG {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("GCD of 20 and 28: " + gcd(20, 28)); // Output: 4
        System.out.println("GCD of 60 and 36: " + gcd(60, 36)); // Output: 12
    }
}
