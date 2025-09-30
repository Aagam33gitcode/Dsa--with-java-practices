package patterns;

public class Balanced_Binary_Tree_110 {
    public class TreeNode {
    int val;
      Diameter_edge_543.TreeNode left;
      Diameter_edge_543.TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, Diameter_edge_543.TreeNode left, Diameter_edge_543.TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    class Solution {
        public boolean isBalanced(Diameter_edge_543.TreeNode root) {
return Balanced(root);

        }
        public boolean Balanced(Diameter_edge_543.TreeNode root){
            if(root==null){
                return true;
            }
            boolean left=Balanced(root.left);
            boolean right=Balanced(root.right);
            boolean sb=Math.abs(heigth(root.left)-heigth(root.right))<= 1;
            return left&&right&&sb;
        }
        public int heigth(Diameter_edge_543.TreeNode root){
            if(root==null){
                return -1;
            }
            int lht=heigth(root.left);
            int rht=heigth(root.right);
            return Math.max(lht,rht)+1;
        }
    }
}
