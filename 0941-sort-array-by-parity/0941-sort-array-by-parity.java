class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int y = 0;
        int z = nums.length-1;
        for(int i : nums){
            if(i % 2 == 0){
                arr[y] = i;
                y++;
            }
            else{
                arr[z] = i;
                z--;
            }
        }
        return arr;
    }
}