class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0)
                candidate = num;            // pick a new candidate

            count += (num == candidate) ? 1 : -1;  // vote
        }

        return candidate;
    }
}