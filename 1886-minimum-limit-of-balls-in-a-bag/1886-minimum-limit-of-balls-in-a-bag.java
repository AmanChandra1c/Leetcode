class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
       int left = 1; // Minimum possible size
        int right = getMax(nums); // Maximum possible size

        // Binary search for the minimum possible max size
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canDivide(nums, mid, maxOperations)) {
                right = mid; // Try smaller max size
            } else {
                left = mid + 1; // Try larger max size
            }
        }
        return left;
    }

    // Helper function to calculate the maximum in the array
    private int getMax(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Helper function to check if all bags can be ≤ maxSize with maxOperations
    private boolean canDivide(int[] nums, int maxSize, int maxOperations) {
        int operations = 0;
        for (int balls : nums) {
            operations += (balls - 1) / maxSize;
            if (operations > maxOperations) {
                return false; // Exceeds allowed operations
            }
        }
        return true;
    }
}