package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    private BinaryTree.Node root;
    static void main(String[] args) {

    }
    public void levelOder(){
        Queue<BinaryTree.Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            BinaryTree.Node rv=q.poll();
            System.out.println(rv.value+" ");
            if (rv.left!=null){
                q.add(rv.left);

            }
            if (rv.right!=null){
                q.add(rv.right);
            }

        }
        System.out.println();
    }
}

