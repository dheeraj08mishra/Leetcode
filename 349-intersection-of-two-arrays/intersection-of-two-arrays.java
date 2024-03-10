class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer>hs = new HashSet<>();
        while (i<nums1.length&&j<nums2.length){
            if(nums2[j]==nums1[i]){
                hs.add(nums2[j]);
                 i++;
                j++;
            } else if(nums2[j]<nums1[i]){
               j++;
            } else{
                i++;
            }
        }
        int[] ans = new int[hs.size()];
        int counter=0;
        for(Integer current:hs){
            ans[counter]=current;
            counter++;
        }
        return ans;
    }
}