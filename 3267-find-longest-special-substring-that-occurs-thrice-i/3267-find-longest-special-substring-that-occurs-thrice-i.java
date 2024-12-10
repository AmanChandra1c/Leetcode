class Solution {
     public static boolean isSpecial(String s) {
        char firstChar = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c != firstChar) {
                return false;
            }
        }
        return true;
    }
    public int maximumLength(String s) {
        int n = s.length();
        int maxLength = -1;

        // Iterate over possible lengths of special substrings
        for (int len = 1; len <= n; len++) {
            HashMap<String, Integer> substringCount = new HashMap<>();

            // Sliding window to count substrings of length len
            for (int i = 0; i <= n - len; i++) {
                String sub = s.substring(i, i + len);

                // Check if it's a special substring (all characters are the same)
                if (isSpecial(sub)) {
                    substringCount.put(sub, substringCount.getOrDefault(sub, 0) + 1);

                    // If the substring occurs at least three times, update maxLength
                    if (substringCount.get(sub) >= 3) {
                        maxLength = Math.max(maxLength, len);
                    }
                }
            }
        }

        return maxLength;
    }
}