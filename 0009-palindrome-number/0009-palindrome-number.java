class Solution {
    public boolean isPalindrome(int x) {
        
        int revex = 0;
        int dx = x;
        while(dx > 0){   
            int rem = dx % 10;
            revex = revex * 10 + rem;
            dx = dx/10;
        }

        return x == revex;
    }
}