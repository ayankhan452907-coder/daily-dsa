// Problem: All Divisors of a Number (GeeksforGeeks)
// Pattern Signal: Divisor Pairing / Square Root Optimization
// Time Complexity: O(sqrt(n) + k log k) where k is the number of divisors
// Space Complexity: O(k)

import java.util.ArrayList;
import java.util.Collections;

public class AllDivisorsGFG {
    public static ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                nums.add(i);

                if (i != n / i) {
                    nums.add(n / i);
                }
            }
        }

        Collections.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println("Divisors of 20: " + getDivisors(20));       // Output: [1, 2, 4, 5, 10, 20]
        System.out.println("Divisors of 21191: " + getDivisors(21191)); // Output: [1, 21191]
        System.out.println("Divisors of 36: " + getDivisors(36));       // Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]
    }
}
