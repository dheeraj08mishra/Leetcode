class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> lesser = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                lesser.add(nums[i]);
            } else if (nums[i] > pivot) {
                greater.add(nums[i]);
            } else {
                equal.add(nums[i]);
            }
        }
        int[] ans = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < lesser.size(); i++) {
            ans[counter++] = lesser.get(i);

        }
        for (int i = 0; i < equal.size(); i++) {
            ans[counter++] = equal.get(i);
        }
        for (int i = 0; i < greater.size(); i++) {
            ans[counter++] = greater.get(i);
        }
        return ans;
    }
}