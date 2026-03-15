class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums1){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        } 

        for(int i : nums2){
            if(hm.containsKey(i) && hm.get(i) > 0){
                list.add(i);
                hm.put(i, hm.get(i)-1);
            }
        }
        int[] aarr = new int[list.size()];
        for(int i = 0; i < aarr.length; i++){
            aarr[i] = list.get(i);
        }

        return aarr;    
    }
}