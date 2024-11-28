class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i : hm.keySet()){
            if(hm.get(i) == 1){
                list.add(i);
            }
        }
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}