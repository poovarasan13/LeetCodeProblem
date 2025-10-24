class Solution {
    public double calculateTax(int[][] brackets, int income) {
        int prev = 0;
        double taxes = 0;

        for(int[] bracket : brackets) {
            if(income <= 0)
                break;

            int diff = Math.min((bracket[0] - prev), income);

            taxes += (double) diff * ((double) bracket[1] / 100);

            income -= diff;
            prev = bracket[0];
        }

        return taxes;
    }
}