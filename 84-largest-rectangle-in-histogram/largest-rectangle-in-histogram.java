class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] left = firstSmallestIndexLeft(heights);
        int[] right = firstSmallestIndexRight(heights);
        int area = 0;
        for (int i = 0; i < heights.length; i++) {
            area = Math.max(area, (right[i] - left[i] - 1) * heights[i]);

        }
        return area;
    }

    private static int[] firstSmallestIndexLeft(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int B[] = new int[heights.length];
        Arrays.fill(B, -1);
        for (int i = 0; i < heights.length; i++) {
            while (st.size() > 0 && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.size() > 0 && heights[st.peek()] < heights[i]) {
                B[i] = st.peek();
            }
            st.push(i);
        }
        return B;
    }

    private static int[] firstSmallestIndexRight(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[heights.length];
        Arrays.fill(ans, heights.length);

        for (int i = heights.length - 1; i >= 0; i--) {
            while (st.size() > 0 && heights[st.peek()] > heights[i]) {
                st.pop();
            }
            if (st.size() > 0 && heights[st.peek()] <= heights[i]) {
                ans[i] = st.peek();
            }

            st.push(i);

        }
        return ans;
    }
}