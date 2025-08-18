class Solution {

    private static final double EPSILON = 1e-6;
    private static final double target = 24.0;

    public boolean judgePoint24(int[] cards) {
        List<Double> list = new ArrayList<>();
        for(int card : cards){
            list.add((double)card);
        }
        return backtrack(list);
    }

    private boolean backtrack(List<Double> list){
        if(list.size() == 1){
            return Math.abs(list.get(0) - target) < EPSILON;
        }
        int n = list.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j) continue;
                
                double a = list.get(i);
                double b = list.get(j);

                List<Double> next = new ArrayList<>();
                for(int k=0;k<n;k++){
                    if(k != i && k != j){
                        next.add(list.get(k));
                    }
                }

                //Add
                next.add(a+b);
                if(backtrack(next)) return true;
                next.remove(next.size()-1);

                //Subtract
                next.add(a-b);
                if(backtrack(next)) return true;
                next.remove(next.size()-1);

                //Multiply
                next.add(a*b);
                if(backtrack(next)) return true;
                next.remove(next.size()-1);

                if(Math.abs(b) > EPSILON){
                    //Divison
                    next.add(a/b);
                    if(backtrack(next)) return true;
                    next.remove(next.size()-1);
                }

            }
        }
        return false;
    }
}
