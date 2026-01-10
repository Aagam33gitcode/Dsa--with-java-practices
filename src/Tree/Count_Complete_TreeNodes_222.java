package Tree;

import Tree.Pratics.BT_DiameterTree;
import com.sun.source.tree.Tree;

public class Count_Complete_TreeNodes_222 {
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
      public int countNode(TreeNode root){
           if (root==null){
               return 0;
           }
           int leftCount=1;
           int rightCount=1;
           TreeNode leftRoot=root;
           TreeNode rightRoot=root;
           while (rightRoot.left!=null){
             leftCount = leftCount+1;
               rightRoot=rightRoot.left;
           } while (leftRoot.right!=null){
              rightCount= rightCount+1;
               leftRoot=leftRoot.right;
           }

           if (leftCount==rightCount){
               return (int) (Math.pow(2,leftCount)-1);
           }
           return 1+countNode(root.left)+countNode(root.right);
      }
}
