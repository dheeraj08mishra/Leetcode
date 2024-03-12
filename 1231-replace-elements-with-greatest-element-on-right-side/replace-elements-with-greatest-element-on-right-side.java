class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length==1){
            arr[0]=-1;
            return arr;
        }
        if(arr.length==2){
            arr[0]=arr[1];
            arr[1]=-1;
            return arr;
        }
        int temp = Math.max(arr[arr.length-1],arr[arr.length-2]);

        for(int i=arr.length-3;i>=0;i--){
            int currentMax = Math.max(temp,arr[i]);
            arr[i] = temp;
            temp = currentMax;
        }
        arr[arr.length-2]=arr[arr.length-1];
        arr[arr.length-1]=-1;
        return arr;
        
    }
}