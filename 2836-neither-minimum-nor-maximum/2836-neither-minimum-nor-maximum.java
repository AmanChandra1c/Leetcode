class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length <= 2) return -1;
        int max = nums[0];
        int min = nums[0];
        for(int i : nums){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        for(int i : nums){
            if(i > min && i < max) return i;
        }
        return -1;
    }
}