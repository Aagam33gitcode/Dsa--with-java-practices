package patterns;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    Scanner sc=new Scanner(System.in);
    private Node root;
    public BinaryTree(){
        root=create();
    }
    private Node create(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;
        boolean hlc=sc.nextBoolean();
        if (hlc){
            nn.left=create();
        }
        boolean hrc=sc.nextBoolean();
        if (hrc){
            nn.right=create();
        }
        return nn;
    }
    public void Display(){
        Dispaly(root);
    }
    private void Dispaly(Node node){
        if(node==null){
            return;
        }
        String s="";
        s="<--"+node.val+"-->";
        if(node.left!=null){
            s=node.left.val+s;

        }else {
            s="."+s;
        }
        if(node.right!=null){
            s=s+node.right.val;

        }else {
            s=s+".";
        }
        System.out.println(s);
        Dispaly(node.left);
        Dispaly(node.right);
    }
    public boolean findItem(int item){
      return   findItem(this.root,item);
    }
    private boolean findItem(Node nn, int item){
        if(nn==null){
            return false;
        }
        if(nn.val==item){
            return true;
        }
        boolean left=findItem(nn.left,item);
        boolean right=findItem(nn.right,item);
        return left || right;
    }
    public int maxitem(){
        return maxitem(this.root);
    }
    private int maxitem(Node node){
        if (node==null) return Integer.MIN_VALUE;
        int left=maxitem(node.left);
        int right=maxitem(node.right);
        return Math.max(node.val, Math.max(left, right));
    }
    public int height(){
        return height(this.root);
    }
    private  int  height(Node node){
        if(node==null){
            return -1;
        }
        int left =height(node.left);
        int right=height(node.right);
        return Math.max(left, right)+1;
    }
    public void postOrder(){
        postOrder(this.root);
        System.out.println();
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val+" ");

    }
    public void preOrder(){
        preOrder(this.root);
        System.out.println();
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.val+" ");
        postOrder(node.left);
        postOrder(node.right);

    }
    public void InOrder(){
        InOrder(this.root);
        System.out.println();
    }
    private void InOrder(Node node){
        if(node==null){
            return;
        }postOrder(node.left);
        System.out.println(node.val+" ");
        postOrder(node.right);

    }
    public void levelOrder(){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
       while(!q.isEmpty()){
           Node rv=q.poll();
           System.out.print(rv.val+" ");
       if(rv.left!=null){
           q.add(rv.left);
       }
       if(rv.right!=null){
           q.add(rv.right);
       }
       }
        System.out.println();
    }
    public static void main(String[] args) {
        //Input Format : 10 true 20 true 40 false false false true 20 false true 30 false false
        BinaryTree CT=new BinaryTree();
        CT.Display();
        System.out.println(CT.findItem(20));
        System.out.println("MAximum value: "+CT.maxitem());
        System.out.println("Tree Heigth : "+CT.height());
        CT.levelOrder();
        

    }
}
