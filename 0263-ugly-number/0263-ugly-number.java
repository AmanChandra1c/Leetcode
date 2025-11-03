class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] fact = {2,3,5};

        for(int i : fact){
            while(n % i == 0){
                n /= i;
            }
        }
            return n == 1;
    }
}