package patterns;

public class Diameter_edge_543 {
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
        public int diameterOfBinaryTree(TreeNode root) {
int ld=diameterOfBinaryTree(root.left);
int rd=diameterOfBinaryTree(root.right);
int sd=heigth(root.left)+heigth(root.right)+2;
return Math.max(sd,Math.max(ld,rd));
        }public int heigth(TreeNode root){
            if(root==null){
                return -1;
            }
            int lht=heigth(root.left);
            int rht=heigth(root.right);
       return Math.max(lht,rht)+1;
        }
    }
}
