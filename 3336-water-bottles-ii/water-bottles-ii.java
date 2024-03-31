class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int bottleDrunk = 0;

        while (numBottles > 0) {
            int availableToExchange = 0;
            if (numBottles > numExchange) {
                availableToExchange = numExchange;
            } else {
                availableToExchange = numBottles;
            }

            bottleDrunk = bottleDrunk + availableToExchange;
            numBottles = numBottles - availableToExchange;

            if (numExchange == availableToExchange) {
                numExchange++;
                numBottles++;
            }

        }
        return bottleDrunk;
    }
}