class Solution {

    public int binarySearch(int []nums, int target, int s, int e){
        while(s <= e){
            int mid = s + (e - s)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target)  s = mid+1;
            else e = mid-1;  
        }
        return s;
    }

    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }
}