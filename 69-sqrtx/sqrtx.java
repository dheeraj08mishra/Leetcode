class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int start = 0, end = x/2 +1, ans = 0;
        while (start <= end) {
             int mid = start + (end - start) / 2;
            if ( mid == x/mid) {
                ans = mid;
                return mid;
            } else if (mid  > x/mid) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }

        }
        return ans;
    }
}