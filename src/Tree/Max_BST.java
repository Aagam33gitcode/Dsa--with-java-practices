package Tree;

public class Max_BST {
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

    public int maxNode(TreeNode node){
        if (node==null){
        return Integer.MIN_VALUE;}
        int right=maxNode(node.right);
        return Math.max(node.val,right);

    }
}
