class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hm2Set = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!hm.containsKey(arr1[i])) {
                hm.put(arr1[i], 1);
            } else {
                hm.put(arr1[i], hm.get(arr1[i]) + 1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            hm2Set.add(arr2[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!hm2Set.contains(arr1[i])) {
                al.add(arr1[i]);
            }
        }
        Collections.sort(al);
        int index = 0;
        int alIndex = 0;
        int[] ans = new int[arr1.length];

        int counter = 0;
        for (int i = 0; i < ans.length; i++) {
            if (counter < ans.length - al.size()) {
                index = index + hm.get(arr2[i]);
                while (counter < index) {
                    ans[counter++] = arr2[i];
                }
            } else {
                ans[counter++] = al.get(alIndex++);
            }
            if (counter == ans.length) {
                i = counter;
            }

        }
        return ans;
    }
}