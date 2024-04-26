class Solution {
    public int heightChecker(int[] heights) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        int[] countArray = new int[max + 1];
        for (int i = 0; i < heights.length; i++) {
            countArray[heights[i]]++;
        }
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] = countArray[i - 1] + countArray[i];
        }
        int[] output = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            output[countArray[heights[i]] - 1] = heights[i];
            countArray[heights[i]]--;
        }
        int notMatchCount=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=output[i]){
                notMatchCount++;
            }
        }
        return notMatchCount;
    }
}