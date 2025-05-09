class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

      

        List<Integer>result=new ArrayList<>();

        int rowL=0;
        int rowU=matrix.length-1;
        int colL=0;
        int colU=matrix[0].length-1;

        while(rowL <= rowU && colL<=colU){

            for(int i=colL ;i<=colU;i++){
                result.add(matrix[rowL][i]);
            }
            rowL++;

            for(int i=rowL;i<=rowU;i++){
                result.add(matrix[i][colU]);
            }
            colU--;

            if(rowL<=rowU){

                for(int i=colU;i>=colL;i--){
                    result.add(matrix[rowU][i]);
                }
                rowU--;
            }

            if(colL<=colU) {
                for (int i = rowU; i >= rowL; i--) {
                    result.add(matrix[i][colL]);
                }
                colL++;
            }

        }
        return result;
    }
    
        
    
}