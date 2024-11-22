class Solution {
    public boolean checkIfPangram(String sentence) {
       ArrayList<Character> hm = new ArrayList<>();
        for(char ch : sentence.toCharArray()){
            hm.add(ch);
        }
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(!hm.contains(ch)) return false;
        }
        return true;
    }
}