class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int valueAtK = tickets[k];
       int sum = 0;
        for (int i = 0; i < tickets.length; i++) {
            if(i<=k){
                sum = sum+ Math.min(valueAtK,tickets[i]);
            }else{
                sum = sum+ Math.min(valueAtK-1,tickets[i]);
            }

        }
        return sum;
    }
}