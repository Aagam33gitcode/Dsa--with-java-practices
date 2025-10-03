package Tree;

public class Delete_Node_BST_450 {

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
    private TreeNode root;
    class Solution {

    private TreeNode delete(TreeNode node, int key) {
        if (node == null) {
            return null;
        }
        if (node.val < key) {
            node.right = delete(node.right, key);
        } else if (node.val>key){
            node.left=delete(node.left,key);
        }
        else {
            if (node.left==null){
                return node.right;
            } else if (node.right==null) {
                return node.left;
            }else {

            int max=max(node.left);
            node.left=delete(node.left,max);
            node.val=max;
        }}
        return node;}
    private int max(TreeNode node){
        if (node==null){
            return Integer.MIN_VALUE;
        }
        int right=max(node.right);
        return Math.max(node.val,right);

    }}

}
