class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() < 1) return true;
        if(t.length() < 1) return false;
        int j = 0;
        for(int i : t.toCharArray()){
            if(j < s.length() && i == s.charAt(j)){
                j++;
            }
        }
        if(j == s.length()) return true;
    return false;
    }
}