package Tree;

import com.sun.source.tree.Tree;

public class Lowest_Common_Ancestor_BT_236 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
return lowAncestor(root,p,q);
        }
        public  TreeNode lowAncestor(TreeNode root, TreeNode p, TreeNode q){
            if (root==null){
                return null;
            }

            if (root==p||root==q){
                return root;
            }
            TreeNode left=lowAncestor(root.left,p,q);
            TreeNode right=lowAncestor(root.right,p,q);
            if (left!=null&&right!=null){
                return root;
            } else if (left==null) {
                return right;


            }
            else {
                return left;
            }
        }
    }


}
