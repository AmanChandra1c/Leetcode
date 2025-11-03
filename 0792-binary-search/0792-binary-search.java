class Solution {

    public static int binarySearch(int[] arr, int s, int e, int target){
        while(s <= e){
        int mid = s + (e - s)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) e = mid - 1;
            else s = mid + 1;
        }
        return -1;
    } 

    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
}