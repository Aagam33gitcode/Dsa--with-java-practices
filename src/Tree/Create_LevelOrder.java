package Tree;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_LevelOrder {
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
        }    }
        private  TreeNode root;
    Scanner sc=new Scanner(System.in);
    public Create_LevelOrder(){

        root=buildTree();

        System.out.println();
    }

    private TreeNode buildTree() {
        System.out.println("Enter input: ");
        int item= sc.nextInt();
        TreeNode node=new TreeNode();
        node.val=item;
        root=node;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()){
            TreeNode rv=q.poll();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
if (c2!=-1){
    TreeNode n=new TreeNode();
    n.val=c2;
    rv.right=n;
    q.add(n);

}if (c1!=-1){
    TreeNode n=new TreeNode();
    n.val=c1;
    rv.left=n;
    q.add(n);

}
        }return root;
    }
}
