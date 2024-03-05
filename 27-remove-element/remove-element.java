class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
         int []arr = new int[nums.length];
        for(int i= 0; i<nums.length;i++){
                if(nums[i]!=val){
                    arr[j++]=nums[i];
            }
        }
         for(int i= 0; i<nums.length;i++){
                
                    nums[i]=arr[i];
        }
        
        
        
        return j;
        
    }
}