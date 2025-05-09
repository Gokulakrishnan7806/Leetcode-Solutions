class Solution {
    public int[] rowAndMaximumOnes(int[][] matrix) {

         int row=matrix.length;
        int col=matrix[0].length;
        int rowindex=0;
        int maxcount=0;



        for(int i=0;i<row;i++){

            int count=0;

            for(int j=0;j<col;j++){

                if(matrix[i][j]==1){
                    count++;
                }
            }
            if(count > maxcount ){
                maxcount=count;
                rowindex=i;
            }


        }
        return new  int[]{rowindex,maxcount};
        
    }
}