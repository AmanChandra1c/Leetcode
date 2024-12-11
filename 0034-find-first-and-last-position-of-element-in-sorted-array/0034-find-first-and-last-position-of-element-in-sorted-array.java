class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        
        if (nums.length == 0) return arr;
        
        int i = 0;
        int j = nums.length - 1;
        
        while (i <= j) {
            if (nums[i] == target && arr[0] == -1) arr[0] = i; 
            if (nums[j] == target && arr[1] == -1) arr[1] = j;
            
            if (arr[0] != -1 && arr[1] != -1) break;
            
            if (arr[0] == -1) i++;
            if (arr[1] == -1) j--;
        }
        
        return arr;
    }
}