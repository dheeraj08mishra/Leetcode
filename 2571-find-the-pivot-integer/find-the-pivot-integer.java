class Solution {
    public int pivotInteger(int n) {
       int counter=1;
        int ans=-1;
        while(counter<n){
            int left = ((counter)*(counter+1))/2;
            int right = ((n*(n+1))/2)-((counter-1)*(counter))/2;
            if(left == right){
                ans=counter;
                break;
            }
            counter++;
        }
        return n==1?1:ans;
        
    }
}