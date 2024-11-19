class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> hm = new HashMap<>();
        HashMap<Character,Character> mh = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(hm.containsKey(a) && !hm.get(a).equals(b)) return false;
            else hm.put(a,b);

            if(mh.containsKey(b) && !mh.get(b).equals(a)) return false;
            else mh.put(b,a);
        }
        return true;
    }
}