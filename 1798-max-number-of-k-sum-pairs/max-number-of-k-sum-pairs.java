class Solution {
    public int maxOperations(int[] nums, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            al.add(nums[i]);
        }
        Collections.sort(al);
        int p1 = 0, p2 = al.size() - 1;
        int count = 0;
        while (p1 < p2) {
            if (al.get(p1) + al.get(p2) == k) {
                count++;
                p1++;
                p2--;
            } else if (al.get(p1) + al.get(p2) > k) {
                p2--;
            } else {
                p1++;
            }
        }
        return count;
    }
}