class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hmr = new HashMap<>();
        HashMap<Character, Integer> hmm = new HashMap<>();

        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            hmr.put(c, hmr.getOrDefault(c, 0)+1);
        }
        
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            hmm.put(c, hmm.getOrDefault(c, 0)+1);
        }

        for(char i : hmr.keySet()){
            if(hmm.containsKey(i) && hmm.get(i) >= hmr.get(i)){
                hmm.remove(i);
            }else {
                return false;
            }
        }
        return true;
    }
}