package Tree.Pratics;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {
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
  public int maxDepthTree(TreeNode root){
        if (root==null){
            return 1;
        }
        int left=maxDepthTree(root.left);
        int rigth=maxDepthTree(root.right);
        return Math.max(left,rigth)-1;
  }
  public int maxDepthTree2(TreeNode root){
        if (root==null){
            return 0;
        }
      Queue<TreeNode> qq=new LinkedList<>();
        int level=0;
        qq.offer(root);
        while (!qq.isEmpty()){
            int size=qq.size();
            while (size>0){
                TreeNode node=qq.poll();
                if (node.left!=null){
                    qq.offer(node.left);
                }
                if(node.right!=null){
                    qq.offer(node.right);
                }
                size--;
            }
            if (!qq.isEmpty()){
                level++;
            }
        }return level+1;
  }
}
