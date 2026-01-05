package Tree.Pratics;

import com.sun.source.tree.Tree;
import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder_Traversal {
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
        public List<Integer> postOderTraversal(TreeNode root){
            List<Integer> ans= new ArrayList<>();
             postOrder(root, ans);
             return ans;
        }
    }
        public void postOrder(TreeNode root, List<Integer> ans){
        if (root==null){
        return;}
        postOrder(root.left,ans);
        postOrder(root.right,ans);
        ans.add(root.val);
        }
        public List<Integer> postOrderItreative(TreeNode root){
        List<Integer> ans=new ArrayList<>();
            Stack<TreeNode> st=new Stack<>();
            TreeNode node=root;
            while(node!=null||!st.isEmpty()){
                while (node!=null){
                    st.push(node);
                    node=node.left;
                }
                if (st.peek().right!=null){
                    node=st.peek().right;
                }else{
                    TreeNode temp=st.pop();
                    ans.add(temp.val);
                    while (!st.isEmpty() && temp==st.peek().right){
                    temp=st.pop();
                    ans.add(temp.val);
                    }
                }
            }return ans;
        }
    }

