class Solution {
    public long findScore(int[] nums) {
         int n = nums.length;
        boolean[] marked = new boolean[n];
        long score = 0;

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> nums[a] != nums[b] ? Integer.compare(nums[a], nums[b]) : Integer.compare(a, b));

        for (int i : indices) {
            if (!marked[i]) {
                score += nums[i];
                marked[i] = true;
                if (i > 0) marked[i - 1] = true;
                if (i < n - 1) marked[i + 1] = true;
            }
        }
        return score;
    }
}