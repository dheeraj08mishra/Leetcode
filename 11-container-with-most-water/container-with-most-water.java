class Solution {
    public int maxArea(int[] height) {
        int pointer1 = 0;
        int pointer2 = height.length - 1;
        int maxArea = 0;
        while (pointer1 < pointer2) {
            int ht = Math.min(height[pointer1], height[pointer2]);
            int width = pointer2 -pointer1;
            int water = ht * width;
            maxArea = Math.max(maxArea, water);
            if (height[pointer1] <= height[pointer2]) {
                pointer1++;
            } else {
                pointer2--;
            }
        }
        return maxArea;
    }
}