class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int small = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++){
            for(int j = 0; j < nums.length; j++){
                small = Math.min(nums[j],small);
                }
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == small){
                    nums[j] = nums[j] * multiplier;
                    small = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        return nums;
    }
}