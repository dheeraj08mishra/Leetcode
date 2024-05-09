class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < happiness.length; i++) {
            al.add(happiness[i]);
        }
        Collections.sort(al);
        long sum = 0;
        int count = 0;
        int n = al.size();
        while (k > 0 && n > 0 && al.get(n - 1) > 0) {
            sum = sum + (al.get(n - 1));
            n--;
            count++;
            if (n > 0) {
                al.set(n - 1, al.get(n - 1) - count);
            }
            k--;
        }
        return sum;
    }
}