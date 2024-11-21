class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int bar = 0;
        for(char i : s.toCharArray()){
            hm.put(i,hm.getOrDefault(i,0)+1);
            bar = hm.get(i);
        }
        for(char i : hm.keySet()){
            if(bar != hm.get(i)) return false;
        }
        return true;
    }
}