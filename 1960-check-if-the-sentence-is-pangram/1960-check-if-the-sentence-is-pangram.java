class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 24) return false;
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(sentence.indexOf(ch) == -1) return false;
        }
        return true;
    }
}