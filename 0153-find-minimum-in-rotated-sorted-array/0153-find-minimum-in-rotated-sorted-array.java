class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int max = nums[0];
    
        while(i < j){
            max = Math.min(max,nums[j]);
            max = Math.min(nums[i],max);
            i++;j--;
        }
        max = Math.min(max, nums[i]);
        return max;
    }
}