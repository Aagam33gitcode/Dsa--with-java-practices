package Tree.Pratics;

import java.util.HashMap;

public class PreInOrder_Traversal {
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
        public TreeNode preinOrder(int[] pre,int[] in,int ilo,int ihi,int plo,int phi){
          if(ilo>ihi||plo>phi){
              return null;
          }
            TreeNode node=new TreeNode(pre[plo]);
            int idx=searchInElement(in,ilo,ihi,pre[plo]);
            int netElemnt=idx-ilo;
            node.left=preinOrder(pre,in,ilo,idx-1,plo+1,plo+netElemnt);
            node.right=preinOrder(pre,in,idx+1,ihi,plo+netElemnt+1,phi);
            return node;
        }
    }

    private int searchInElement(int[] in, int ilo, int ihi, int i) {
        for (int j = 0; j < in.length; j++) {
            if (in[j]==i){
                return j;
            }
        }

        return 0;
    }
}
