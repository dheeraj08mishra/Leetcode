class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer>hs1 = new HashSet<>();
        HashSet<Integer>hs2 = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            hs1.add(nums1[i]);   ///6,13,18,28,34,37  ......
        }
        for(int i=0;i<nums2.length;i++){
            hs2.add(nums2[i]);  ///10,13,19,27......
        }
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for (Integer ele : hs1) {
            if(hs2.contains(ele)){
                if(min1>ele){
                    min1=ele;
                }
            }
        }
        for (Integer ele : hs2) {
            if(hs1.contains(ele)){
                if(min2>ele){
                    min2=ele;
                }
            }
        }
        if(min1==min2 && min1!=Integer.MAX_VALUE){
            return min1;
        }else{
            return -1;
        }
    }
}