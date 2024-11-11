class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] arr = new int[2];
        int j = 0;
        for(int i : nums){
            if(hm.containsKey(i)){
                arr[j] = i;
                j++;
            }
            else hm.put(i,0);
        }
        Arrays.sort(arr);
        return arr;
    }
}