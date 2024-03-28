class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                al.add(al.get(al.size() - 1) + al.get(al.size() - 2));
            } else if (operations[i].equals("C")) {
                al.remove(al.get(al.size() - 1));
            } else if (operations[i].equals("D")) {
                al.add(al.get(al.size() - 1) * 2);
            } else {
                al.add(Integer.parseInt(operations[i]));
            }

        }
        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            sum += al.get(i);
        }
        return sum;
    }
}