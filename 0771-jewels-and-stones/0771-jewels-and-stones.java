class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char i : jewels.toCharArray()){
            hm.put(i,0);
        }
        int sum = 0;
        for(char i : stones.toCharArray()){
            if(hm.containsKey(i)){
                sum++;
            }
        }
        return sum;
    }
}