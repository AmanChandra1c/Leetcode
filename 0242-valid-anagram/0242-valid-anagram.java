class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String sr = new String(a);
        String tr = new String(b);
        
        return sr.equals(tr);
    }
}