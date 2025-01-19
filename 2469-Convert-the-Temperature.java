class Solution {
    public double[] convertTemperature(double celsius) {
        double[] answer=new double[2];
        answer[0]=celsius+273.15;
        answer[1]=(celsius*1.80)+32.00;
        return answer;
    }
}