package Tree;

import java.util.List;

public class NaryPreOder_589 {
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
    }public void preOrderNary(Node root, List<Integer> ans){
        if (root==null){
            return;
        }
        ans.add(root.val);
        for (Node child: root.children){
            preOrderNary(child,ans);
        }
    }
}
