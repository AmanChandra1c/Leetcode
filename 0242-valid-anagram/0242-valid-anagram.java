class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> hms = new HashMap<>();
        HashMap<Character, Integer> hmt = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            hms.put(c1, hms.getOrDefault(c1, 0)+1);
            hmt.put(c2, hmt.getOrDefault(c2, 0)+1);
        }
        for(char i : hms.keySet()){
            if (!hmt.containsKey(i) || !hms.get(i).equals(hmt.get(i))) {
                return false;
            }
        }

        return true;
    }
}