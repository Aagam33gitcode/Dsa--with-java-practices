package patterns;

import java.util.ArrayList;
import java.util.List;

public class BT_right_view_199 {
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
    }

    class Solution {
        int visit = -1;

        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ll = new ArrayList<>();
            view(root, 0, ll);
            return ll;
        }

        public void view(TreeNode root, int curr, List<Integer> ll) {
            if(root==null){
                return;
            }
            if(curr>visit) {
                ll.add(root.val);
                visit = curr;
                view(root.right, curr, ll);
                view(root.left, curr, ll);
            }
        }
    }
}

