class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        List<Integer> list = new ArrayList<>();

        for (int[] row : matrix) {

            for (int val : row) {

                list.add(val);
            }
        }

        return list.get(k-1);
        
    }
}