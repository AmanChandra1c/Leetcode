class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int x = 0;
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
            x = Math.max(hm.get(i),x);
        }
        int sum = 0;
        for(int i : hm.keySet()){
            if(hm.get(i) == x) sum += hm.get(i);
        }
        return sum;
    }
}