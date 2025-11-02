class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[] = s.split(" ");
        if(pattern.length() != str.length) return false;
        HashMap<String, Character> hmp = new HashMap<>();
        HashMap<Character, String> hms = new HashMap<>();

        for(int i = 0; i < str.length; i++){
            char c1 = pattern.charAt(i);
            String c2 = str[i];

            if(hms.containsKey(c1)){
                if(!hms.get(c1).equals(c2)) return false;
            }else{
                hms.put(c1,c2);
            }
            
            if(hmp.containsKey(c2)){
                if(!hmp.get(c2).equals(c1)) return false;
            }else{
                hmp.put(c2,c1);
            }
        }
        return true;
    }
}