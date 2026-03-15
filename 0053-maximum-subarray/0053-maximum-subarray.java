class Solution {
    public int maxSubArray(int[] nums) {
        int crntsum = nums[0];
        int maxsum = nums[0];

        for(int i = 1; i < nums.length; i++){
            crntsum = Math.max(nums[i], crntsum + nums[i]);
            maxsum = Math.max(maxsum, crntsum);
        }
        return maxsum;
    }
}