package Tree;



public class PostInOder_Traversal_106 {
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
        public TreeNode postinOrder(int[] post, int[] in, int ilo, int ihi, int plo, int phi) {
            if (ilo > ihi || plo > phi) {
                return null;
            }
            TreeNode node = new TreeNode(post[phi]);
            int idx = searchInElement(in, ilo, ihi, post[phi]);
            int netElemnt = idx - ilo;
            node.left = postinOrder(post, in, ilo, idx - 1, plo, plo + netElemnt - 1);
            node.right = postinOrder(post, in, idx + 1, ihi, plo + netElemnt, phi - 1);
            return node;
        }

        private int searchInElement(int[] in, int ilo, int ihi, int i) {
            for (int j = ilo; j <= ihi; j++) {
                if (in[j] == i) {
                    return j;
                }
            }
            return -1;

        }
    }
}