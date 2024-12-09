class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
                int n = nums.length;
        int m = queries.length;

        // Step 1: Precompute adjacent parity differences
        boolean[] diffParity = new boolean[n - 1];
        for (int i = 0; i < n - 1; i++) {
            diffParity[i] = (nums[i] % 2) != (nums[i + 1] % 2);
        }

        // Step 2: Build prefix sum of the diffParity array
        int[] specialCount = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            specialCount[i] = diffParity[i] ? 1 : 0;
            if (i > 0) {
                specialCount[i] += specialCount[i - 1];
            }
        }

        // Step 3: Process each query
        boolean[] result = new boolean[m];
        for (int i = 0; i < m; i++) {
            int from = queries[i][0];
            int to = queries[i][1];

            // Single-element subarrays are always special
            if (from == to) {
                result[i] = true;
                continue;
            }

            // Check the number of valid pairs in the range
            int validPairs = specialCount[to - 1] - (from > 0 ? specialCount[from - 1] : 0);
            result[i] = validPairs == (to - from);
        }

        return result;

    }
}