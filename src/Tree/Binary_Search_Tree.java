package Tree;

public class Binary_Search_Tree {
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
    public Binary_Search_Tree(int[] in){

        root=craeteTree(in, 0,in.length-1);
    }

    private TreeNode craeteTree(int[] in, int si, int ei) {
       if (si>ei){
           return null;
       }
        int mid=(si+ei)/2;
        TreeNode nn=new TreeNode();
        nn.val=in[mid];
        nn.left=craeteTree(in,0,mid-1);
        nn.right=craeteTree(in,mid+1,ei);
        return nn;
    }
}
