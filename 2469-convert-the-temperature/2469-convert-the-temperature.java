class Solution {
    public double[] convertTemperature(double celsius) {

        double[] arr=new double[2];

        double ferenhit=celsius*((double) 9 /5)+32;
        double kelvin=celsius+273.15;
       arr[0]=kelvin;
       arr[1]=ferenhit;

       return arr;
        
    }
}