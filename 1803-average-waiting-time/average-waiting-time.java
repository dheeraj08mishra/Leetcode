class Solution {
    public double averageWaitingTime(int[][] customers) {
        double waitTime = 0;
        double totalTime = 0;
        for (int i = 0; i < customers.length; i++) {
            if (i == 0) {
                totalTime = customers[i][1] + customers[i][0];
                waitTime = totalTime - customers[i][0];
            } else {
                if (customers[i][0] > totalTime) {
                    totalTime = customers[i][0] + customers[i][1];
                    waitTime += totalTime - customers[i][0];
                } else {
                    totalTime += customers[i][1];
                    waitTime += totalTime - customers[i][0];
                }
            }

        }
        return waitTime / customers.length;
    }
}