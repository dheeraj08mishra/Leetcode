class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < matrix.length; i++) {
            int[] temp = matrix[i];
            for (int j = 0; j < temp.length; j++) {
                pq.add(temp[j]);
            }
        }

        while (k > 1) {
            pq.remove();
            k--;
        }
        return pq.peek();
    }
}