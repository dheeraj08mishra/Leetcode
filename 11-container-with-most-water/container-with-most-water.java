class Solution {
    public int maxArea(int[] height) {
          int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while (left < right) {
            // Calculate the width of the container.
            int width = right - left;
            
            // Calculate the height of the container (minimum of the two lines).
            int containerHeight = Math.min(height[left], height[right]);
            
            // Calculate the current area and update maxArea if necessary.
            int area = width * containerHeight;
            maxArea = Math.max(maxArea, area);
            
            // Move the pointer pointing to the shorter line inward.
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
}