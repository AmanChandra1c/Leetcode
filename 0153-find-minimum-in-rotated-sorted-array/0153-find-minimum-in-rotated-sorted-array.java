class Solution {
    public int findMin(int[] nums) {
        // int min = nums[0];
        // int i = 0, j = nums.length-1;

        // while(i <= j){
        //     min = Math.min(Math.min(nums[i], nums[j]), min);
        //     i++; j--;
        // }
        // return min;

        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }
        return nums[left];
    }
}