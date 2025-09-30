package patterns;

public class mirror_flip_951 {
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
        public boolean flipEquiv(TreeNode root1, TreeNode root2) {
            return equiv(root1,root2);}
      public boolean equiv(TreeNode root1,TreeNode root2) {
          if (root1 == null || root2 == null) {
              return false;
          }
          if (root1 == null && root2 == null) {
              return true;
          }
          if (root1.val != root2.val) {
              return false;
          }
          boolean flip = equiv(root1.left, root2.right) && equiv(root1.right, root2.left);
          boolean noflip = equiv(root1.left, root2.left) && equiv(root1.right, root2.right);

          return flip || noflip;
      
        }
        }
    }
