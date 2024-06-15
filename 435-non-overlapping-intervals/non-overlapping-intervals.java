class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[1]));
        int first = intervals[0][1];
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (first > intervals[i][0]) {
                count++;
            } else {
                first = intervals[i][1];
            }

        }
        return count;
    }
}