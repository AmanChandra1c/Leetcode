class Solution {
    public boolean canChange(String start, String target) {
         String startPieces = start.replace("_", "");
        String targetPieces = target.replace("_", "");
        
        // If the sequences of 'L' and 'R' are not the same, return false
        if (!startPieces.equals(targetPieces)) {
            return false;
        }

        // Use two pointers to validate the movement constraints
        int startPointer = 0, targetPointer = 0;
        int n = start.length();

        while (startPointer < n && targetPointer < n) {
            // Move pointers to the next 'L' or 'R'
            while (startPointer < n && start.charAt(startPointer) == '_') {
                startPointer++;
            }
            while (targetPointer < n && target.charAt(targetPointer) == '_') {
                targetPointer++;
            }

            // If both pointers reach the end, the strings are valid
            if (startPointer == n && targetPointer == n) {
                return true;
            }

            // If one pointer reaches the end and the other doesn't, return false
            if (startPointer == n || targetPointer == n) {
                return false;
            }

            // Check the position constraints for 'L' and 'R'
            if (start.charAt(startPointer) != target.charAt(targetPointer)) {
                return false;
            }
            if (start.charAt(startPointer) == 'L' && startPointer < targetPointer) {
                return false;
            }
            if (start.charAt(startPointer) == 'R' && startPointer > targetPointer) {
                return false;
            }

            // Move both pointers
            startPointer++;
            targetPointer++;
        }

        return true;
    }
}