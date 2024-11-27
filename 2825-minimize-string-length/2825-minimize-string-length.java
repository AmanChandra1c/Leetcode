class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> hs = new HashSet<>();
        for(char i : s.toCharArray()){
            hs.add(i);
        }
        return hs.size();
    }
}