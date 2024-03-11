class Solution {
    public int pivotIndex(int[] nums) {
        int[]pf = new int[nums.length];
        pf[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            pf[i] = pf[i-1]+nums[i];
        }

        if(pf[pf.length-1]==pf[0]){
            return 0;
        }
        // if(pf[pf.length-2]==0){
        //    return pf.length-1;
        // }
        for(int i=1;i<pf.length;i++){
            if(pf[i-1]==pf[pf.length-1]-pf[i]){
                return i;
            }
        }
        return -1;
    }
}