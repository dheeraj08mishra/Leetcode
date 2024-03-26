class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        /// Brute force
        // int p1 = 0, p2 = 1;
        // int count = 0;
        // int[] arr = new int[nums.length];
        // while (p1 < nums.length && p2 < nums.length) {
        // if (nums[p1] != nums[p2] && nums[p2] < nums[p1]) {
        // count++;
        // p2++;
        // } else {
        // p2++;
        // }
        // arr[p1] = count;
        // if (p2 == nums.length) {
        // p1++;
        // p2 = 0;
        // count = 0;
        // }
        // }

        /// hashmap approch

        int[] arr = new int[nums.length];
        int[] temp = new int[nums.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = nums[i];
        }
        Arrays.sort(temp); // 1,2,2,3,8
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < temp.length; i++) {
            if (hm.containsKey(temp[i])) {
                hm.put(temp[i], hm.get(temp[i]));
            } else {
                hm.put(temp[i], i);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            arr[i] = hm.get(nums[i]);
        }
        return arr;
    }
}