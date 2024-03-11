class Solution {
    int print2largest(int arr[], int n) {
        // code here
       int firstMax=Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(firstMax<arr[i]){
                firstMax=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=firstMax && secondMax<arr[i]){
                secondMax=arr[i];
            }
        }
        return secondMax==Integer.MIN_VALUE?-1:secondMax;
    }
}
