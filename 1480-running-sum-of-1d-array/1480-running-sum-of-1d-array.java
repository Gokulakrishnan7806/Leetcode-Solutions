class Solution {
    public int[] runningSum(int[] arr) {

        int sum=0;

        int[] newArr=new int[arr.length];

        for(int i=0;i<arr.length;i++){

            for(int j=i;j<=i;j++){

               sum=sum+arr[j];
               newArr[i]=sum;

            }
        }
        return newArr;
        
    }
}