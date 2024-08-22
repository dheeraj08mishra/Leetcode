class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
        HashSet<List> hs = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int pointer1=i+1, pointer2=nums.length-1;
            while (pointer1<pointer2){
                if(nums[i]+nums[pointer1]+nums[pointer2]==0){
                    ArrayList<Integer>al = new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[pointer1]);
                    al.add(nums[pointer2]);
                    hs.add(al);
                    pointer1++;
                }else{
                    if(nums[i]+nums[pointer1]+nums[pointer2]>0){
                        pointer2--;
                    }else{
                        pointer1++;
                    }
                }
            }
        }

        for (List listtemp: hs) {
            list.add(listtemp);
        }
        hs.clear();
        return list;
    }
}