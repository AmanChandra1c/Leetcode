class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(i != val){
                list.add(i);
            }
        } 
        int j = 0;
        for(int i : list){
            nums[j] = i;
            j++;
        }
        return list.size();
    }
}