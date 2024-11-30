class Solution {
    public int[] sortArrayByParity(int[] nums) {
       ArrayList<Integer> even = new ArrayList<>();
       ArrayList<Integer> odd = new ArrayList<>();
       for(int i : nums){
        if(i % 2 == 0) even.add(i);
        else odd.add(i);
       }
       int[] arr = new int[even.size()+odd.size()];
       int z = 0;
        for(int x : even){
            arr[z] = x;
            z++;
       }
        for(int x : odd){
            arr[z] = x;
            z++;   
        }
        return arr;
    }
}