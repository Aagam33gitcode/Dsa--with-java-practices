package patterns;
public class symmetic_101 {
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
        public boolean isSymmetric(TreeNode root) {

return symmetric(root.left,root.right);
        }
public boolean symmetric(TreeNode root1, TreeNode root2){
            if(root1==null&&root2==null){
                return true;
            }
            if(root1==null||root2==null){
                return false;
            }
            if (root1.val!=root2.val){
                return false;
            }
            boolean b1=symmetric(root1.left,root2.right);
            boolean b2=symmetric(root1.right,root2.left);
            return b1&&b2;
}
    }

}
