class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0;
        int index = 0;
        int max = nums[0];
        while(i < nums.length){
            if(max < nums[i]){
                index = i;
                max = nums[i];
            }
            i++;
        }
        return index;
    }
}