class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
         int i=0,j=0,k=0;
        int length = Math.max(nums1.length,nums2.length);
        while (k<length){
            if(nums1[i]>nums2[nums2.length-1]){
               return -1;
            }
            else if(nums2[j]>nums1[nums1.length-1]){
                return -1;
            }
            if(nums2[j]==nums1[i]){
               return nums1[i];
            } else if(nums2[j]<nums1[i]){
               j++;
            } else{
                i++;
            }

        }
        return -1;
    }
}