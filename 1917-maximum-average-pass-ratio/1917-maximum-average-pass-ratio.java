class Solution {
    private double marginalGain(int pass, int total) {
        return ((double) (pass + 1) / (total + 1)) - ((double) pass / total);
    }
    public double maxAverageRatio(int[][] classes, int extraStudents) {
                PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
            Double.compare(marginalGain(b[0], b[1]), marginalGain(a[0], a[1]))
        );

        // Add all classes to the priority queue
        for (int[] cls : classes) {
            pq.offer(cls);
        }

        // Assign extra students
        for (int i = 0; i < extraStudents; i++) {
            int[] cls = pq.poll(); // Get the class with the highest gain
            cls[0]++; // Add one more passing student
            cls[1]++; // Increase total students
            pq.offer(cls); // Recalculate gain and push back into the heap
        }

        // Calculate the final average pass ratio
        double totalRatio = 0;
        for (int[] cls : pq) {
            totalRatio += (double) cls[0] / cls[1];
        }

        return totalRatio / classes.length;

    }
}