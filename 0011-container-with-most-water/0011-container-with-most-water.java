class Solution {
    public int maxArea(int[] height) {
        int water = 0;
        int i = 0;
        int len = height.length-1;
        int j = height.length - 1;
        while(i < j){
            if(height[i] <= height[j]){
                int temp = height[i] * len;
                water = Math.max(temp, water);
                len--;
                i++;
            }else {
                int temp = height[j] * len;
                water = Math.max(temp, water);
                len--;
                j--;
            }
        }

        return water;
    }
}