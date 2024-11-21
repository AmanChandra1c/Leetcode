class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Boolean> hm = new HashMap<>();
        for(char i : s.toCharArray()){
            if(hm.containsKey(i)) return i;
            else hm.put(i,true);
        }
        return 'a';
    }
}