package Tree;

import java.util.List;

public class NarayDiameter {
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
    class Diapair{
        int ht=-1;
        int dt=0;
    }
    public Diapair diameter(Node root){
        if(root==null){
            return new Diapair();
        }
        int h1=-1;
        int h2=-1;
        int dia=0;
        for (Node child:root.children) {
            Diapair cp = diameter(child);
            dia=Math.max(dia,cp.dt);
            if (h1 < cp.ht) {
                h2 = h1;
                h1 = cp.ht;

            } else if (h2 < cp.ht){
                h2= cp.ht;
            }
        }
        Diapair self=new Diapair();
        self.ht=h1+1;
        int selfdia=h1+h2+2;
        self.dt=Math.max(dia,selfdia);
        return self;
    }


}
