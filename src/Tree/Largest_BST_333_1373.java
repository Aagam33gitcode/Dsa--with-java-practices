package Tree;

public class Largest_BST_333_1373 {
    public class TreeNode {
        int val;
        Validate_BST_98.TreeNode left;
        Validate_BST_98.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Validate_BST_98.TreeNode left, Validate_BST_98.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public boolean isValidBST(Validate_BST_98.TreeNode root) {
//            return validBST(root).isbst;
            return validBST(root).isbst;
        }

        private BstPair validBST(Validate_BST_98.TreeNode root) {
            if(root==null){
                return new BstPair();
            }
            BstPair lfbst=validBST(root.left);
            BstPair rgbst=validBST(root.right);
            BstPair sbbst=new BstPair();
            sbbst.ismin=Math.min(root.val,Math.min(lfbst.ismin,rgbst.ismin));
            sbbst.ismax=Math.max(root.val,Math.max(lfbst.ismax,rgbst.ismax));
            sbbst.isbst=lfbst.isbst&& rgbst.isbst&&root.val>lfbst.ismax&&root.val<rgbst.ismin;
           if (sbbst.isbst){
               sbbst.ans=Math.max(lfbst.sum+ rgbst.sum+root.val,Math.max(lfbst.ans,rgbst.ans));
           sbbst.sum=lfbst.sum+ rgbst.sum+root.val;
           }
           else {
               sbbst.ans=Math.max(lfbst.ans,rgbst.ans);
           }
            return sbbst;
        }

    }
    class BstPair{
        boolean isbst=true;
        Long ismin=Long.MAX_VALUE;
        Long ismax=Long.MIN_VALUE;
//        int size=0;
int ans=0;
        int sum=0;
    }
}
