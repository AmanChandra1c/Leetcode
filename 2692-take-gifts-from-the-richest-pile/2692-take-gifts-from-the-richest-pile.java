class Solution {
    public long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            // Find the index of the pile with the maximum gifts
            int maxIndex = 0;
            for (int j = 1; j < gifts.length; j++) {
                if (gifts[j] > gifts[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Update the pile with the floor of its square root
            gifts[maxIndex] = (int) Math.floor(Math.sqrt(gifts[maxIndex]));
        }

        // Calculate the sum of the remaining gifts
        long totalGifts = 0;
        for (int gift : gifts) {
            totalGifts += gift;
        }
        return totalGifts;
    }

}