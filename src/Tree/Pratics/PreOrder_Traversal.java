package Tree.Pratics;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder_Traversal {
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
      public void preOder(TreeNode root) {
List<Integer> ans=new ArrayList<>();
if (root==null){

    return;
}
ans.add(root.val);

        preOder(root.left);
        preOder(root.right);
      }
  }
  public List<Integer>  preOrderIterative(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        if (root==null){
            return ans;
        }
      Stack<TreeNode> st=new Stack<>();
      st.push(root);
      while (!st.isEmpty()){
          TreeNode node=st.pop();
          ans.add(node.val);
          if (node.right!=null){
          st.push(node.right);}
          if (node.left!=null){
          st.push(node.left);}
      }
      return ans;
  }

}
