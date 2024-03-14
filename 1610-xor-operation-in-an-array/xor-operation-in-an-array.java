class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= start+2*i;
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans= ans^arr[i];
        }
        return ans;
    }
}