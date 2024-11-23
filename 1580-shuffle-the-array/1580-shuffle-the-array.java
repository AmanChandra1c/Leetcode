class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int k = 0;
        int m = n;
        for(int i = 0; i < n; i++){
            arr[k] = nums[i];
            arr[k+1] = nums[m];
            k = k + 2;
            m++;
        }
            return arr;
    }
}