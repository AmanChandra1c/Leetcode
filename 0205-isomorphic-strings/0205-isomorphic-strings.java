class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return true;

        HashMap<Character, Character> hmst = new HashMap<>();
        HashMap<Character, Character> hmts = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(hmst.containsKey(c1)){
                if(hmst.get(c1) != c2) return false;
            }else{
                hmst.put(c1,c2);
            }

            if(hmts.containsKey(c2)){
                if(hmts.get(c2) != c1) return false;
            }else{
                hmts.put(c2,c1);
            }
        }
            return true;
    }
}