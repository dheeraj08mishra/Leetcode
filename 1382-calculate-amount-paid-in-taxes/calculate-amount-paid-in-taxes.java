class Solution {
    public double calculateTax(int[][] brackets, int income) {
        int remain = 0;
        double tax = 0;
        if (income <= 0)
            return 0;
        for (int i = 0; i < brackets.length; i++) {
            if (i == 0) {
                if (income > brackets[i][0]) {
                    remain += income - brackets[i][0];
                    tax += (double) (brackets[i][0] * brackets[i][1]) / 100;
                } else {
                    tax += (double) (income * brackets[i][1]) / 100;
                }

            } else {
                if (remain > brackets[i][0] - brackets[i - 1][0]) {
                    remain -= brackets[i][0] - brackets[i - 1][0];
                    tax += (double) ((brackets[i][0] - brackets[i - 1][0]) * brackets[i][1]) / 100;
                } else {
                    tax += (double) (remain * brackets[i][1]) / 100;
                    remain = 0;
                }

            }
        }
        return tax;
    }
}