class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int p1 = 0, p2 = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> al = new ArrayList<>();
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                p1++;
            } else if (nums1[p1] > nums2[p2]) {
                p2++;
            } else {
                al.add(nums1[p1]);
                p1++;
                p2++;
            }
        }
        int[] intArray = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            intArray[i] = al.get(i);
        }

        return intArray;
    }
}