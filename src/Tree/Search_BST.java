package Tree;

public class Search_BST {
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
    public boolean search(TreeNode node,int item){
        if (node==null){
            return false;
        }
        if (node.val==item){
            return true;
        } else if (node.val>item) {
            return search(node.left,item);

        }
        else {
            return search(node.right,item);
        }
    }
}
