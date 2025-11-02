class Solution {
    public void reverseString(char[] s) {
        int j = s.length-1;
        int i = 0;
        char k;
        while( i < j){
            k = s[i];
            s[i] = s[j];
            s[j] = k;
            i++;
            j--;
        }
    }
}