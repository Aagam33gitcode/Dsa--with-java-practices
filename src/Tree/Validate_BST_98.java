package Tree;

public class Validate_BST_98 {
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
        public boolean isValidBST(TreeNode root) {
return validBST(root).isbst;
}

        private BstPair validBST(TreeNode root) {

        if(root==null){
            return new BstPair();
        }
        BstPair lfbst=validBST(root.left);
        BstPair rgbst=validBST(root.right);
        BstPair sbbst=new BstPair();
        sbbst.ismin=Math.min(root.val,Math.min(lfbst.ismin,rgbst.ismin));
        sbbst.ismax=Math.max(root.val,Math.max(lfbst.ismax,rgbst.ismax));
        sbbst.isbst=lfbst.isbst&& rgbst.isbst&&root.val>lfbst.ismax&&root.val<rgbst.ismin;
        return sbbst;
        }

    }
    class BstPair{
        boolean isbst=true;
        Long ismin=Long.MAX_VALUE;
        Long ismax=Long.MIN_VALUE;

    }


}
