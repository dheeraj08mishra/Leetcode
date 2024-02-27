class Solution {
    public int majorityElement(int[] nums) {
         HashMap<Integer, Integer> hm1 = new HashMap<>();

         for(int i=0;i<nums.length;i++){
             if(hm1.containsKey(nums[i])){
                 hm1.put(nums[i],hm1.get(nums[i])+1);
             }else{
                 hm1.put(nums[i],0);
             }
         }
         int ans=0;
         for(int i=0;i<nums.length;i++){
             if(hm1.get(nums[i])>= nums.length/2){
                 ans= nums[i];
             }
         }
         return ans;
        
    }
}