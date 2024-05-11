class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        Worker[] workers = new Worker[n];
        for (int i = 0; i < n; i++) {
            workers[i] = new Worker(quality[i], wage[i]);
        }

        Arrays.sort(workers, (a, b) -> Double.compare(a.ratio, b.ratio));

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        double minCost = Double.MAX_VALUE;
        int sumQuality = 0;

        for (Worker worker : workers) {
            maxHeap.offer(worker.quality);
            sumQuality += worker.quality;

            if (maxHeap.size() > k) {
                sumQuality -= maxHeap.poll();
            }

            if (maxHeap.size() == k) {
                minCost = Math.min(minCost, sumQuality * worker.ratio);
            }
        }

        return minCost;
    }

    class Worker {
        int quality;
        int wage;
        double ratio;

        public Worker(int quality, int wage) {
            this.quality = quality;
            this.wage = wage;
            this.ratio = (double) wage / quality;
        }
    }
}