/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> list =new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list=new ArrayList<>();
        int leval=0;
        dfs(root,list,leval);
        return list;
        
       
    }

    public void dfs(TreeNode root,List<Integer> list,int leval){

    if(root==null){
        return;
       }

       if(leval == list.size()){

        list.add(root.val);
       }

       dfs(root.right,list,leval+1);
       dfs(root.left,list,leval+1);
    }

        

    
}