package patterns;

public class sum_rootLeaf_129 {
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
        public int sumNumbers(TreeNode root) {
return sumRoot(root,0);
        }
        public int sumRoot(TreeNode root, int num){
            if(root==null) return 0;
            if(root.left==root.right){return num*10+root.val;}
            int left=sumRoot(root.left,num*10+root.val);
            int right=sumRoot(root.right,num*10+root.val);
            return left+right;

        }
    }
}
