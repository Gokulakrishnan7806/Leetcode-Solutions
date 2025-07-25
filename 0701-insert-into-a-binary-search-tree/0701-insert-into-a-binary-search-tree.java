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
    public TreeNode insertIntoBST(TreeNode root, int val) {

        if(root==null){

            root=new TreeNode(val);
            return root;
        }


        TreeNode Current=root;

        while(true){



            if(Current.val <= val){

                if(Current.right!=null){

                  Current=Current.right;


                }
                else{
                    Current.right=new TreeNode(val);
                    break;
                }
            }
            else{

                if(Current.left!=null){

                    Current=Current.left;
                }
                else {
                    Current.left = new TreeNode(val);
                    break;
                }
            }
        }

        return root;
        
    }
}