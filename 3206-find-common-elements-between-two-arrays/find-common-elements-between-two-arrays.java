class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer>hm1 = new HashSet<>();
        HashSet<Integer>hm2 = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
                hm1.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
                hm2.add(nums2[i]);
        }

        int[]ans = new int[2];
        int count1=0,count2=0;
        for(int i=0;i<nums1.length;i++){
            if(hm2.contains(nums1[i])){
                count1++;
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(hm1.contains(nums2[i])){
                count2++;
            }
        }
        

        ans[0]=count1;
        ans[1]=count2;

        return ans;
        
    }
}