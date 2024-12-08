class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1]));
        int n = events.length;
        int maxSum = 0; // To track the global maximum
        int[] prefixMax = new int[n]; // To store the max single event value up to each event

        // Fill prefixMax
        prefixMax[0] = events[0][2]; // Initialize with the value of the first event
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], events[i][2]);
        }

        // Iterate through events to calculate max sum of two non-overlapping events
        for (int i = 0; i < n; i++) {
            int currValue = events[i][2]; // Current event value

            // Binary search to find the best preceding event that doesn't overlap
            int low = 0, high = i - 1, bestIdx = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (events[mid][1] < events[i][0]) { // Valid preceding event
                    bestIdx = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            // If there's a valid preceding event, add its value
            if (bestIdx != -1) {
                currValue += prefixMax[bestIdx];
            }

            // Update the global max sum
            maxSum = Math.max(maxSum, currValue);
        }

        return maxSum;
    }
}