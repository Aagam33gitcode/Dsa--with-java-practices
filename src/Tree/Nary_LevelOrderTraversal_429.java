package Tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Nary_LevelOrderTraversal_429 {
    class Node<E>{
        List<Node> child;
        E val;

        public Node(E val) {
            child=new ArrayList<>();
            this.val = val;
        }
        public List<List<Integer>> BFS(Node<Integer> root){
            List<List<Integer>> ans=new ArrayList<>();
            if(root==null){
                return ans;
            }

            Queue<Node> qq=new LinkedList<>();
            qq.offer(root);
            while (!qq.isEmpty()) {
                List<Integer> ww = new ArrayList<>();
                int size = qq.size();
                while (size > 0) {
                    Node<Integer> node = qq.poll();
                    ww.add(node.val);
                    for (Node child : node.child) {
                        if (child != null) {
                            qq.offer(child);

                        }
                    }
                    size--;
                }ans.add(ww);

            }
            return ans;
        }
    }}


