class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(!list.contains(i)) list.add(i);
        }
        int j = 0;
        for(int i : list){
            nums[j] = i;
            j++;
        }
        return list.size();
    }
}