class Solution {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length;
        int left = 0;
        long count = 0;

        int min = nums[0]; 
        int max = nums[0];

        for (int right = 0; right < n; right++) {

            min = Math.min(min, nums[right]);
            max = Math.max(max, nums[right]);

            while (max - min > 2) {
                left++;
                min = nums[left];
                max = nums[left];
                for (int i = left; i <= right; i++) {
                    min = Math.min(min, nums[i]);
                    max = Math.max(max, nums[i]);
                }
            }

            count += (right - left + 1);
        }

        return count;

    }
}