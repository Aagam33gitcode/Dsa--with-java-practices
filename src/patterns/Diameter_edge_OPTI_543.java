package patterns;

public class Diameter_edge_OPTI_543 {
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

        class Solution {
            public int diameterOfBinaryTree(TreeNode root) {
                return diameterOfBinaryTree1(root).dt;
            }

            public diaPair diameterOfBinaryTree1(TreeNode root) {
                if (root == null) {
                    return new diaPair();
                }
                diaPair ld = diameterOfBinaryTree1(root.left);
                diaPair rd = diameterOfBinaryTree1(root.right);
                diaPair sdp = new diaPair();
                int sd = ld.ht + rd.ht + 2;
                sdp.dt = Math.max(sd, Math.max(ld.dt, rd.dt));
                sdp.ht = Math.max(ld.ht, rd.ht) + 1;
                return sdp;

            }

            class diaPair {
                int dt = 0;
                int ht = -1;
            }
        }
    }}



