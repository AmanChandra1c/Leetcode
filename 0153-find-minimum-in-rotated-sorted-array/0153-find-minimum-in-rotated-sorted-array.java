class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int i = 0, j = nums.length-1;

        while(i <= j){
            min = Math.min(Math.min(nums[i], nums[j]), min);
            i++; j--;
        }
        return min;
    }
}