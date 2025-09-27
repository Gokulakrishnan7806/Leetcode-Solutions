class Solution {
    public void rotate(int[][] arr) {

        int rows = arr.length;
        int cols= arr[0].length;


        for(int i=0; i <  rows-1;i++){
            for(int j=i+1;j<rows;j++){

                swap(arr,i,j,j,i);
            }
        }


        for (int i = 0; i < rows; i++) {
            int left = 0, right = rows - 1;
            while (left < right) {
                swap(arr, i, left, i, right);
                left++;
                right--;
            }
        }

     
        
    }

    public   void swap(int[][] arr, int i1,int j1,int i2,  int j2){

        int temp = arr[i1][j1];
        arr[i1][j1] = arr[i2][j2];
        arr[i2][j2]= temp;
    }
}