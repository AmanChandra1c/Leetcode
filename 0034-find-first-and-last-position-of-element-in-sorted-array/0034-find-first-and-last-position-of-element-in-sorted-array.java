class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] temp = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (temp[0] == -1) temp[0] = i; // First time found
                temp[1] = i;                    // Keep updating last index
            }
        }

        return temp;
    }
}
