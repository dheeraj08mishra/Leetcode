class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> al = new ArrayList();
        for (int i = 0; i < stones.length; i++) {
            al.add(stones[i]);
        }
        Collections.sort(al);
        while (al.size() > 1) {
            int temp = Math.abs(al.get(al.size() - 1) - al.get(al.size() - 2));
            al.remove(al.size() - 1);
            al.remove(al.size() - 1);

            al.add(temp);
            Collections.sort(al);
        }
        return al.get(0);
    }
}