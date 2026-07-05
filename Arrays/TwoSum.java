/**
 * Problem: Two Sum
 * Platform: LeetCode
 * Topic: Arrays
 * Day: 1
 *
 * Approach:
 * - Use two nested loops.
 * - Check every possible pair.
 * - Return the indices if the sum equals the target.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return nums;
    }
}
