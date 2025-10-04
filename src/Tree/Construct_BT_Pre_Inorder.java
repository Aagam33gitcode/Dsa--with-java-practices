package Tree;

public class Construct_BT_Pre_Inorder {
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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
return bt(preorder,inorder,0,inorder.length-1,0,preorder.length-1);
        }

        private TreeNode bt(int[] preorder, int[] inorder, int ilo, int ihi, int plo, int phi) {
       if (ilo>ihi||plo>phi){
           return null;
       }
        TreeNode node=new TreeNode(preorder[plo]);
        int idx=search(inorder,ilo,ihi,preorder[plo]);
        int netEle=idx-ilo;
        node.left=bt(preorder,inorder,ilo,idx+1,plo+1,plo+netEle);
        node.right=bt(preorder,inorder,idx+1,ihi,plo+netEle+1,phi);
        return node;

        }

        private int search(int[] inorder, int ilo, int ihi, int item) {
            for (int i = ilo; i <=ihi; i++) {
                if (inorder[i]==item){
                    return i;
                }
            }
            return 0;
        }

    }
}
