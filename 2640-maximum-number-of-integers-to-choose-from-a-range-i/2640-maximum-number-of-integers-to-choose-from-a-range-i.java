class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum = 0;
        int count = 0;
        boolean[] ban = new boolean[10001];
        for(int b : banned){
            ban[b] = true;
        }
        for(int i = 1; i <= n; i++){
            if(sum + i > maxSum) break;
            if(!ban[i]){
                sum += i;
                count++;
            }
        }
        return count;
    }
}