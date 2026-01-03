package Tree;

import java.util.List;

public class NarayPostOrder_590 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public void narayPostOder(Node root, List<Integer> ans){
        if (root==null){
            return;
        }
        for (Node child: root.children){
            narayPostOder(child,ans);
        }
        ans.add(root.val);
    }
}
