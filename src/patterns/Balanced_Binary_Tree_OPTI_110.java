package patterns;

public class Balanced_Binary_Tree_OPTI_110 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public Boolean isBalanced(TreeNode root) {
            return Balanced(root).isbla;
        }
        public BlanacedPair Balanced(TreeNode root) {
            if (root == null) {
                return new BlanacedPair();
            }
            BlanacedPair left=Balanced(root.left);
            BlanacedPair right=Balanced(root.right);
            BlanacedPair sbp=new BlanacedPair();
            sbp.ht=Math.max(left.ht,right.ht)+1;
            boolean sb=Math.abs(left.ht-right.ht)<=1;
            sbp.isbla=left.isbla&& right.isbla&&sb;
            return sbp;
        }
        class BlanacedPair{
            boolean isbla=true;
            int ht=-1;
        }
}}