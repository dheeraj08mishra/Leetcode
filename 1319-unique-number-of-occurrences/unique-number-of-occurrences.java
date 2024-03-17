class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i],hm.get(arr[i])+1);
            } else {
               hm.put(arr[i],1);
            }
        }
        boolean present=false;
        for(int i=0;i<arr.length;i++){
            hs.add(hm.get(arr[i]));
        }

        return hs.size()==hm.size()?true:false;
    }
}