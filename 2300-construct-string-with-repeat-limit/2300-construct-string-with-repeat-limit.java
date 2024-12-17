class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] freq = new int[26];
        
        // Count frequencies of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        // Add all characters with non-zero frequency to the max heap
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                maxHeap.offer(new int[]{i, freq[i]});
            }
        }

        while (!maxHeap.isEmpty()) {
            int[] top = maxHeap.poll();
            int charIndex = top[0];
            int count = top[1];
            char currentChar = (char) ('a' + charIndex);

            int use = Math.min(repeatLimit, count);

            // Append the character `use` times
            for (int i = 0; i < use; i++) {
                result.append(currentChar);
            }

            count -= use;

            if (count > 0) {
                if (maxHeap.isEmpty()) {
                    break; // No other character to break the sequence
                }
                int[] next = maxHeap.poll();
                char nextChar = (char) ('a' + next[0]);

                result.append(nextChar); // Add one occurrence of the next largest character
                next[1]--;

                if (next[1] > 0) {
                    maxHeap.offer(next); // Re-add the next character if it still has frequency left
                }
                maxHeap.offer(new int[]{charIndex, count}); // Re-add the original character with reduced frequency
            }
        }

        return result.toString();

    }
}