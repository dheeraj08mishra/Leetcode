class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hm1 = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm1.containsKey(nums[i])){
                 hm1.put(nums[i],hm1.get(nums[i])+1);
             }else{
                 hm1.put(nums[i],1);
             }
        }
        int maxFrequency = 0;
        for (int freq : hm1.values()) {
            maxFrequency = Math.max(maxFrequency, freq);
        }
        int maxFrequencyCount = 0;
        for (int freq : hm1.values()) {
            if (freq == maxFrequency) {
                maxFrequencyCount++;
            }
        }
            return maxFrequency * maxFrequencyCount;
        }
        
    }
