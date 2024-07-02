class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], count + 1);
        }
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == hm.get(arr[i])) {
                ans = Math.max(ans, arr[i]);
            }
        }
        return ans;
    }
}