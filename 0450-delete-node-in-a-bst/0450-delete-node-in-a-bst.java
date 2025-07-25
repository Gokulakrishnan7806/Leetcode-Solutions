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
    public TreeNode deleteNode(TreeNode root, int val) {

         if(root==null){

            return root;
        }

        if(root.val==val){

            return  helper(root);
        }

        TreeNode dummy=root;

        while(root!=null){

             if(root.val > val){

                 if(root.left !=null && root.left.val==val){

                     root.left=helper(root.left);
                     break;
                 }
                 else{
                     root=root.left;
                 }
             }

             else{

                 if(root.right!=null && root.right.val==val){

                     root.right=helper(root.right);
                     break;
                 }
                 else{
                     root=root.right;
                 }
             }
        }

         
         return dummy;
    }

    public static  TreeNode helper(TreeNode root){

        if(root.left==null){
            return  root.right;
        }
        else if (root.right==null) {

            return root.left;
        }

        TreeNode rightchild=root.right;

        TreeNode lastright=LastRight(root.left);
         lastright.right=rightchild;

         return root.left;

    }

    public static  TreeNode LastRight(TreeNode root){

        if(root==null){
            return null;
        }

          while(root.right!=null){

            root=root.right;
          }

        return root;
    }
        
    
}