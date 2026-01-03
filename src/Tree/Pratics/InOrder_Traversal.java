package Tree.Pratics;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder_Traversal {
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
        }}
    public void inorderTraversal(TreeNode root, List<Integer> ans){
        if (root==null){
            return;
        }
        inorderTraversal(root.left,ans);
        ans.add(root.val );
        inorderTraversal(root.right,ans);
    }
    public List<Integer> inorderIterative(TreeNode root){

        Stack<TreeNode> st=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        TreeNode node=root;
        while (node!=null||!st.isEmpty()){

            while(node!=null) {
                st.push(node);
                node=node.left;
            }
            node=st.pop();
            ans.add(node.val);
            node=node.right;
        }
        return ans;
    }

}
